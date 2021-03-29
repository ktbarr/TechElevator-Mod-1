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
		
		System.out.println("1. Remaining Number of Birds = " + remainingNumberOfBirds);

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		
		System.out.println("2. Number of Extra Birds = " + numberOfExtraBirds);
		
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int numberOfRaccoonsPlaying = 3;
		int numberOfRaccoonsThatWentHome = 2;
		int numberOfRaccoonsLeftInWoods = numberOfRaccoonsPlaying - numberOfRaccoonsThatWentHome;
		
		System.out.println("3. Number of Raccoons Left In the Woods = " + numberOfRaccoonsLeftInWoods);
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int flowers = 5;
		int bees = 3;
		int numberLessBees = flowers - bees;
		
		System.out.println("4. Number of Bees Less than Flowers = " + numberLessBees);
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int lonelyPigeon = 1;
		int friendlyPigeon = 1;
		int pigeonsEating = lonelyPigeon + friendlyPigeon;
		
		System.out.println("5. Pigeons Eating = " + pigeonsEating);
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int owlsOnFence = 3;
		int newOwls = 2;
		int totalOwlsOnFence = owlsOnFence + newOwls;
		
		System.out.println("6. Total Owls on Fence = " + totalOwlsOnFence);
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int beaversWorking = 2;
		int beaversWentSwimming = 1;
		int beaversStillWorking = beaversWorking - beaversWentSwimming;
		
		System.out.println("7. Beavers Still Working = " + beaversStillWorking);
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int toucansOnTreeLimb = 2;
		int newToucans = 1;
		int totalToucans = toucansOnTreeLimb + newToucans;
		
		System.out.println("8. Total Toucans = " + totalToucans);
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrelsQ9 = 4;
		int nutsQ9 = 2;
		int numberOfExtraSquirrels = squirrelsQ9 - nutsQ9;
		
		System.out.println("9. Number of Extra Squirrels = " + numberOfExtraSquirrels);
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		double quarterValue = .25;
		double dimeValue = .10;
		double nickelValue = .05;
		
		int numberOfQuarters = 1;
		int numberOfDimes =1;
		int numberOfNickels = 2;
		
		double totalMoneyFound = (quarterValue * numberOfQuarters) 
							   + (dimeValue * numberOfDimes) 
							   + (nickelValue * numberOfNickels);
		
		System.out.println("10. Total Money Found = $" + totalMoneyFound);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int mrsBrierClassMuffins = 18;
		int mrsMacAdamsClassMuffins = 20;
		int mrsFlanneryClassMuffins = 17;
		int totalFirstGradeMuffins = mrsBrierClassMuffins + mrsMacAdamsClassMuffins + mrsFlanneryClassMuffins;
		
		System.out.println("11. Total First Grade Muffins Baked = " + totalFirstGradeMuffins);
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		double yoyoValue = .24;
		double whistleValue = .14;
		double totalSpentOnToys = yoyoValue + whistleValue;
		
		System.out.println("12. Total Spent on Toys = $" + totalSpentOnToys);
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallowsUsed = largeMarshmallows + miniMarshmallows;
		
		System.out.println("13. Total Marshmallows Used = " + totalMarshmallowsUsed);
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int mrsHiltHouseSnow = 29;
		int brecknockSchoolSnow = 17;
		int additionalSnowAtMrsHiltHouse = mrsHiltHouseSnow - brecknockSchoolSnow;
		
		System.out.println("14. Additional Snow at Mrs Hilt's House = " + additionalSnowAtMrsHiltHouse + " inches");
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		double startingMoney = 10;
		double toyTruckCost = 3;
		double pencilCaseCost = 2;
		double moneySpent = toyTruckCost + pencilCaseCost;
		double moneyLeft = startingMoney - moneySpent;
		
		System.out.println("15. Mrs. Hilt has $" + moneyLeft + " left.");
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int marbles = 16;
		int lostMarbles = 7;
		int remainingMarbles = marbles - lostMarbles;
		
		System.out.println("16. Josh's remaining marbles = " + remainingMarbles);
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int currentSeashells = 19;
		int seashellsWanted = 25;
		int seashellsNeeded = seashellsWanted - currentSeashells;
		
		System.out.println("17. Number of Seashells Needed = " + seashellsNeeded);
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
		
		System.out.println("18. Green Balloons = " + greenBalloons);
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int additionalBooks = 10;
		int totalBooksOnShelf = booksOnShelf + additionalBooks;
		
		System.out.println("19. Total Books on Shelf = " + totalBooksOnShelf);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int legsOnABee = 6;
		int numberOfBees = 8;
		int totalLegsOnAllBees = legsOnABee * numberOfBees;
		
		System.out.println("20. Total Legs on All Bees = " + totalLegsOnAllBees);
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double iceCreamConeCost = .99;
		double iceCreamConesBought = 2;
		double costOfIceCreamCones = iceCreamConeCost * iceCreamConesBought;
		
		System.out.println("21. Cost of 2 Ice Cream Cones = $" + costOfIceCreamCones);
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int rocksToCompleteBorder = 125;
		int currentRocks = 64;
		int rocksStillNeeded = rocksToCompleteBorder - currentRocks;
		
		System.out.println("22. Rocks Needed to Complete Border = " + rocksStillNeeded);
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int marblesQ23 = 38;
		int lostMarblesQ23 = 15;
		int marblesLeftQ23 = marblesQ23 - lostMarblesQ23;
		
		System.out.println("23. Marbles Left = " + marblesLeftQ23);
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int totalMilesAway = 78;
		int milesDrove = 32;
		int milesLeft = totalMilesAway - milesDrove;
		
		System.out.println("24. Miles Left = " + milesLeft);
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

		int hour = 60;
		int saturdayMorning = hour += 30;
		int saturdayAfternoon = 45;
		int totalMinutesShovelingSnow = saturdayMorning + saturdayAfternoon;
		
		System.out.println("25. Total Time Spent Shoveling Snow = " + totalMinutesShovelingSnow + " minutes");
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		int hotDogsPurchased = 6;
		double costPerHotDog = .50;
		double costAllHotDogs = hotDogsPurchased * costPerHotDog;
		
		System.out.println("26. Cost of all hot dogs purchased = $" + costAllHotDogs);
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int totalCents = 50;
		int centsPerPencil = 7;
		int pencilsCanBeBought = totalCents / centsPerPencil;
		
		System.out.println("27. Number of Pencils that can be Purchased = " + pencilsCanBeBought);
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int butterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = butterflies - orangeButterflies;
		
		System.out.println("28. Red Butterflies = " + redButterflies);
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double kateMoney = 1.00;
		double candyCost = .54;
		double kateChange = kateMoney - candyCost;
		
		System.out.println("29. Kate's Candy Change = $" + kateChange);
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int marksCurrentTrees = 13;
		int newTrees = 12;
		int totalTrees = marksCurrentTrees + newTrees;
		
		System.out.println("30. Mark's Total Trees = " + totalTrees);
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int hoursInADay = 24;
		int daysUntilGrandmaVisit = 2;
		int hoursUntilGrandmaVisit = hoursInADay * daysUntilGrandmaVisit;
		
		System.out.println("31. Hours Until Grandma's Visit = " + hoursUntilGrandmaVisit + " hours");
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int kimsCousins = 4;
		int gumPiecesPerCousin = 5;
		int piecesOfGumNeeded = kimsCousins * gumPiecesPerCousin;
		
		System.out.println("32. Pieces of Gum Needed = " + piecesOfGumNeeded);
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		double danMoney = 3.00;
		double candyBarCost = 1.00;
		double danMoneyLeft = danMoney - candyBarCost;
		
		System.out.println("33. Dan has $" + danMoneyLeft + " left");
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int boatsInTheLake = 5;
		int peopleOnEachBoat = 3;
		int totalPeopleOnBoats = boatsInTheLake * peopleOnEachBoat;
		
		System.out.println("34. Total People on Boats = " + totalPeopleOnBoats);
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int ellensLegos = 380;
		int sadLostLegos = 57;
		int legosRemaining = ellensLegos - sadLostLegos;
		
		System.out.println("35. Legos Remaining = " + legosRemaining);
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int arthursMuffins = 35;
		int totalMuffinsWanted = 83;
		int muffinsNeeded = totalMuffinsWanted - arthursMuffins;
		
		System.out.println("36. Total Muffins Still Needed = " + muffinsNeeded);
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int numberOfCrayonsMoreWillyHas = willysCrayons - lucysCrayons;
		
		System.out.println("37. Willy has " + numberOfCrayonsMoreWillyHas + " more crayons than Lucy");
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int numberOfStickers = stickersPerPage * pagesOfStickers;
		
		System.out.println("38. Total Number of Stickers = " + numberOfStickers);
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int totalYummyCupcakes = 96;
		int numberOfChildren = 8;
		int cupcakesPerChild = totalYummyCupcakes / numberOfChildren;
		
		System.out.println("39. Cupcakes per child = " + cupcakesPerChild);
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int gingerbreadCookies = 47;
		int cookiesPerGlassJar = 6;
		int leftoverCookies = gingerbreadCookies % cookiesPerGlassJar;
		
		System.out.println("40. Leftover Cookies = " + leftoverCookies);
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int croissants = 59;
		int neighbors = 8;
		int leftoverCroissants = croissants % neighbors;
		
		System.out.println("41. Leftover Croissants = " + leftoverCroissants);
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int oatmealCookies = 276;
		int cookiesPerTray = 12;
		int traysNeeded = oatmealCookies / cookiesPerTray;
		
		System.out.println("42. Cookie Trays Needed = " + traysNeeded);
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int pretzelBites = 480;
		int servingSize = 12;
		int totalServings = pretzelBites / servingSize;
		
		System.out.println("43. Total Servings of Pretzel Bites = " + totalServings);
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int totalLemonCupcakes = 53;
		int lemonCupcakesLeftAtHome = 2;
		int cupcakesForOrphange = totalLemonCupcakes - lemonCupcakesLeftAtHome;
		int cupcakesPerBox = 3;
		int boxesOfCupcakes = cupcakesForOrphange / cupcakesPerBox;
		
		System.out.println("44. Boxes of Lemon Cupcakes = " + boxesOfCupcakes);
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int carrotSticks = 74;
		int peopleServed = 12;
		int leftoverCarrotSticks = carrotSticks % peopleServed;
		
		System.out.println("45. Leftover Carrot Sticks = " + leftoverCarrotSticks);
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int teddyBears = 98;
		int teddyBearsPerShelf = 7;
		int fullTeddyBearShelves = teddyBears / teddyBearsPerShelf;
		
		System.out.println("46. Full Teddy Bear Shelves = " + fullTeddyBearShelves);
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int pictures = 480;
		int picturesPerAlbum = 20;
		int totalAlbums = pictures / picturesPerAlbum;
		
		System.out.println("47. Total Picture Albums = " + totalAlbums);
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int tradingCards = 94;
		double cardsPerBox = 8;
		int fullBoxes = (int) ((int) tradingCards / cardsPerBox);
		double cardsInPartialBox = tradingCards % cardsPerBox;
		
		System.out.println("48. Full Boxes of Cards = " + fullBoxes + " Cards in Partial Box = " + cardsInPartialBox);
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int books = 210;
		int shelves = 10;
		int booksPerShelf = books / shelves;
		
		System.out.println("49. Books per shelf = " + booksPerShelf);
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int croissantsBaked = 17;
		int guests = 7;
		int croissantsPerGuest = croissantsBaked / guests;
		
		System.out.println("50. Croissants per Guest = " + croissantsPerGuest);
		
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

		String firstName = "Kathryn";
		String lastName = "Barr";
		String middleInitial = "A";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";
		
		System.out.println("Bonus 2 - Full Name = " + fullName);
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		

	}

}
