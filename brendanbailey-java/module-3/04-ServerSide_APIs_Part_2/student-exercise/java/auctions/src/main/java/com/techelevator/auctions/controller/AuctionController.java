package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.exception.AuctionNotFoundException;
import com.techelevator.auctions.model.Auction;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }

    
    @RequestMapping( path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(defaultValue = "") String title_like, @RequestParam(defaultValue = "0") double currentBid_lte) {

        if( !title_like.equals("") ) {
            return dao.searchByTitle(title_like);
        }
        if(currentBid_lte > 0) {
            return dao.searchByPrice(currentBid_lte);
        }

        return dao.list();
    }
    @ResponseStatus(code=HttpStatus.NOT_FOUND, reason= "auction does not exist")
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) throws AuctionNotFoundException {
        return dao.get(id);
    }

    // TODO When a new auction has been created, 
    // youʼll need to send a status code of 201(Created) back to the client
    
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping( path = "", method = RequestMethod.POST)
    public Auction create(@Valid @RequestBody Auction auction)  {
        return dao.create(auction);
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public Auction update(@Valid @RequestBody Auction auction, @PathVariable int id)
            throws AuctionNotFoundException {
        return dao.update(auction, id);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) throws AuctionNotFoundException {
        dao.delete(id);
    }
    
}
