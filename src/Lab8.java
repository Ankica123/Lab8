import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		boolean isValid = true;
		String choice = "y";
		int index;
		
		Scanner scnr = new Scanner(System.in);
		
		String [] names = new String [10];
		
		names[0] = "Ankica";
		names[1] = "Teodora";
		names[2] = "Jovana";
		names[3] = "Dimce";
		names[4] = "Marijana";
		names[5] = "Borivoj";
		names[6] = "Todorka";
		names[7] = "Vera";
		names[8] = "Jovo";
		names[9] = "Lela";
		
		String[] food = new String[10];
		food[0] = "Bacon";
		food[1] = "Beets";
		food[2] = "Tuna";
		food[3] = "Yogurt";
		food[4] = "Eggs";
		food[5] = "Fries";
		food[6] = "Pizza";
		food[7] = "Cheeseburger";
		food[8] = "Pie";
		food[9] = "Turkey";

		String[] town = new String[10];
		town[0] = "Boulder";
		town[1] = "Schrute Farms";
		town[2] = "Phylly";
		town[3] = "Nashua";
		town[4] = "Mexico City";
		town[5] = "Novi";
		town[6] = "Rochester";
		town[7] = "Clinton";
		town[8] = "Macomb";
		town[9] = "New York";
		
		System.out.println("Wellcome!");
		
		while(choice.startsWith("y")) {
			

			System.out.println("Which person would you like to know more about?");

		// Show entire list of names
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + 1 + "." + names[i]);
				}

				index = scnr.nextInt() - 1;
		
				while (index < 0 || index >= 10) {
					System.out.println("Enter a valid number:(1-10)");
			index = scnr.nextInt()-1;
		}



		// clear the scanner
		scnr.nextLine();
			System.out.println("That is " + names[index] + ". What would you like to know about " + names[index]
					+ "?(enter\" hometown\" or \"favorite food\")");
			
		String input = scnr.nextLine();
		
		
		do {

			if (input.equalsIgnoreCase("hometown")) {
					System.out.println(names[index] + " is from " + " " + " " + town[index]);
				System.out.println("would you like to know more?(enter\"yes\" or \"no\")");
				input = scnr.nextLine();
				if (input.toLowerCase().charAt(0) == 'y') {
						System.out.println(names[index] + " likes " + food[index]);
					break;
				} else {
					System.out.println("Thanks!");
					break;
				}

			} else if (input.equalsIgnoreCase("favorite food")) {

					System.out.println(names[index] + " likes " + food[index]);
				System.out.println("would you like to know more?(enter\"yes\" or \"no\")");
				input = scnr.nextLine();
				if (input.toLowerCase().charAt(0) == 'y') {
						System.out.println(names[index] + " is from" + town[index]);
					break;
				} else {
					System.out.println("Thanks!");
					break;
				}

			} else {
					System.out.println("Error! Enter \"hometown\"" + "or \"favorite food\" or \"exit\"?");
				input = scnr.nextLine();
					if (input.startsWith("e")) {
						break;
					}
			}

		} while (isValid);
		
		System.out.println("Would you like to know about another person?(y/n)");
        choice = scnr.nextLine();
		}
		System.out.println("Good Bye!");
	}
	}


