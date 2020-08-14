package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

		System.out.println("#1 answer is: " + remainingNumberOfBirds);
		
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */                                                    

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int initialNumberOfRaccoons = 3;
		int raccoonsThatWentToDinner = 2;
		int remainingNumberOfRaccoons = initialNumberOfRaccoons - raccoonsThatWentToDinner;
		
		System.out.println("#3 answer is: " + remainingNumberOfRaccoons);
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int beesMinusFlowers = numberOfFlowers - numberOfBees;
		
		System.out.println("#4 answer is: " + beesMinusFlowers);
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int anotherPigeon = 1;
		int numberOfPigeonsEating = lonelyPigeon + anotherPigeon;
		
		System.out.println("#5 answer is: " + numberOfPigeonsEating);
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int fenceOwls = 3;
		int newFenceOwls = 2;
		int allTheFenceOwls = fenceOwls + newFenceOwls;
		
		System.out.println("#6 answer is: " + allTheFenceOwls);
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int workingBeavers = 2;
		int swimmingBeavers = 1;
		int remainingWorkingBeavers = workingBeavers - swimmingBeavers;
		
		
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int treeLimbToucans = 2;
		int newToucans = 1;
		int allToucans = treeLimbToucans + newToucans;
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrels = 4;
		int nuts = 2;
		int moreSquirrelThanNut = squirrels - nuts;
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		int amountOfDimes = 1;
		int amountOfNickels = 2;
		int allMrsHiltsMoney = amountOfDimes + amountOfNickels;
		
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int mrsBriersClassMuffins = 18;
		int mrsMacAdamsClassMuffins = 20;
		int mrsFlannerysClassMuffins = 17;
		int allMuffinsBaked = mrsBriersClassMuffins + mrsMacAdamsClassMuffins + mrsFlannerysClassMuffins;
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		int yoyoCost = 24;
		int whistleCost = 14;
		int costOfAllToys = yoyoCost + whistleCost;
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int snowAmountAtHilts = 29;
		int snowAmountAtBrecknock = 17;
		int amountMoreOfSnowAtHilts = snowAmountAtHilts - snowAmountAtBrecknock;
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		double mrsHiltMoney = 10;
		double toyTruck = 3;
		double pencil = 2;
		double hiltsMoneyLeft = mrsHiltMoney - (toyTruck + pencil);
	
		System.out.println("#15 answer is: " + hiltsMoneyLeft);
        
		/*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int joshMarbles = 16;
		int marblesLost = 7;
		int remainingMarbles = joshMarbles - marblesLost;
		System.out.println("#16 answer is: " + remainingMarbles);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int megansShells = 19;
		int amountOfShellsMeganWants = 25;
		int amountNeededForCollection = amountOfShellsMeganWants - megansShells;
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int bradsBalloons = 17;
		int numRedBalloons = 8;
		int numGreenBalloons = bradsBalloons - numRedBalloons;
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int booksAddedByMarta = 10;
		int totalBooksOnShelf = booksOnShelf + booksAddedByMarta;
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int beesLegs = 6;
		int octaBees = 8;
		int totalLegsOfEightBees = beesLegs * octaBees;
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double iceCreamCone = 99;
		double amountForTwoCones = iceCreamCone * 2;
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int currentRocks = 64;
		int amountOfRocksToComplete = 125;
		int amountOfRocksNeeded = amountOfRocksToComplete - currentRocks;
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int marbles = 38;
		int amountMarblesMissing = 15;
		int rmngMarbles = marbles - amountMarblesMissing;
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		double milesDrivenTotal = 32;
		double totalDistanceToConcert = 78;
		double milesLeftToDrive = totalDistanceToConcert - milesDrivenTotal;
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

		double shoveledTimeAmntSat = 1.50;
		double shoveledTimeAmntSatPm = 0.45;
		double TotalTimeShoveling = shoveledTimeAmntSat + shoveledTimeAmntSatPm;
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		double boughtHotDogs = 6;
		double costPerHotDog = 0.50;
		double totalForAllDogs = boughtHotDogs + costPerHotDog;
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		double mrsHiltTotalMoney = .50;
		double costOfPencil = .07;
		double amntOfPencilsAfforded = 
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

				
				
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
				/*
		int ellenLegos = 380;
		int lostLegos = 57;
		ellenLegos -= lostLegos;
		System.out.println("#35 answer is: " + ellenLegos);
		*/
		/*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willsCrayons = 1400;
		int lucysCrayons = 290;
		int diffOfWillyAndLucysCrayons = willsCrayons - lucysCrayons;
		System.out.println("#37 answer is: " + diffOfWillyAndLucysCrayons);
        
		/*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersOnPage = 10;
		int totalStickers = stickersOnPage * 22;
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int totalCupcakes = 96;
		int totalChildren = 8;
		int amountPerChild = totalCupcakes / totalChildren;
		System.out.println("#39 answer is: " + amountPerChild);
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int totalGingerBreadCookies = 47;
		int jarCapacity = 6;
		int leftOverCookies = totalGingerBreadCookies % jarCapacity;
		System.out.println("#40 answer is: " + leftOverCookies);
		
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int croissantAmnt = 59;
		int herNeighbors = 8;
		int croissantsLeftOverForMarian = croissantAmnt / herNeighbors;
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

//		int numOfCookiesOnTray = 12;
//		int numOfCookiesAtOneTime = 276;
//		int trayOfCookies = 
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

				
				
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}