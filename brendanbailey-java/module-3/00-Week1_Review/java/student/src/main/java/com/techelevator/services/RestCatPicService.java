package com.techelevator.services;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.techelevator.model.CatPic;

@Component
public class RestCatPicService implements CatPicService {

	private String CAT_PIC_API_URL = "http://aws.random.cat/meow"; // URL to return a random Cat Picture
	private RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public CatPic getPic() {
		// We know that the API at the URL: http://aws.random.cat/meow
		// 	will return a random cat picture
		// Use RestTemplate to call the API
		
		CatPic aCatPic = restTemplate.getForObject(CAT_PIC_API_URL, CatPic.class);
		return aCatPic;
	}
}	
