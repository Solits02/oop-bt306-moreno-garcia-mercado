package mhwgame;


import java.util.Scanner;

interface Customizable {
    void customize();
}

interface Player {
    String getName();
}

abstract class CharacterOption implements Customizable {
    private final String optionName;

    public CharacterOption(String optionName) {
        this.optionName = optionName;
      
    }
    
    public String getOptionName() {
        return optionName;
    }

  
    public abstract void customize();
}

class GenderOption extends CharacterOption {
    private String selectedChoice;

    public GenderOption() {
        super("Gender");
    }

    public void customize() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1;) {
            System.out.println("\nChoose your hunter gender:");
            System.out.println("1 - Male");
            System.out.println("2 - Female");

            String genderChoice = sc.nextLine();

            switch (genderChoice) {
                case "1":
                    System.out.println("Male selected.");
                    selectedChoice = "Male";
                    i++;
                    break;
                case "2":
                    System.out.println("Female selected.");
                    selectedChoice = "Female";
                    i++;
                    break;
                default:
                    System.out.println("Invalid choice. Choose again.");
            }
        }
    }
    public String getSelectedChoice() {
        return selectedChoice;
    }
}

class HairstyleOption extends CharacterOption {
    private String selectedChoice;
    
    public HairstyleOption() {
        super("Hairstyle");
    }
    public void customize() {
    	Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
        System.out.println("\nChoose your hunter hairstyle:");
        System.out.println("1 - Buzz Cut");
        System.out.println("2 - Faded");
        System.out.println("3 - Low Fade");
        System.out.println("4 - Mid Fade");
        System.out.println("5 - High Fade");
        System.out.println("6 - Wolf Cut");
        System.out.println("7 - Pixie Cut");
        System.out.println("8 - Curtain Bangs");
        System.out.println("9 - Long Straight Hair");
        System.out.println("10 - Wedge");
      
    
        String hairstyleChoice = sc.nextLine();
        switch (hairstyleChoice) {
            case "1":
                System.out.println("Buzz Cut selected.");
                selectedChoice = "Buzz Cut";
                i++;
                break;
            case "2":
                System.out.println("Faded selected.");
                selectedChoice = "Faded";
                i++;
                break;
            case "3":
                System.out.println("Low Fade selected.");
                selectedChoice = "Low Fade";
                i++;
                break;
            case "4":
                System.out.println("Mid Fade selected.");
                selectedChoice = "Mid Fade";
                i++;
                break;
            case "5":
                System.out.println("High Fade selected.");
                selectedChoice = "High Fade";
                i++;
                break;
            case "6":
                System.out.println("Wolf Cut selected.");
                selectedChoice = "Wolf Cut";
                break;
            case "7":
                System.out.println("Pixie Cut selected.");
                selectedChoice = "Pixie Cut";
                i++;
                break;
            case "8":
                System.out.println("Curtain Bangs selected.");
                selectedChoice = "Curtain Bangs";
                i++;
                break;
            case "9":
                System.out.println("Long Straight Hair selected.");
                selectedChoice = "Long Straight Hair";
                i++;
                break;
            case "10":
                System.out.println("Wedge selected.");
                selectedChoice = "Wedge";
                i++;
                break;
            default:
                System.out.println("Invalid choice. Choose again.");            
      }
      }	
   }
    public String getSelectedChoice() {
        return selectedChoice;
    }
}   


class HairColorOption extends CharacterOption {
    private String selectedChoice;
    
    public HairColorOption() {
        super("Hair Color");
    }

    public void customize() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1;) {
            System.out.println("\nChoose your hunter hair color:");
            System.out.println("1 - Grey");
            System.out.println("2 - Blue");
            System.out.println("3 - Black");
            System.out.println("4 - Brown");
            System.out.println("5 - Red");

            String hairColorChoice = sc.nextLine();

            switch (hairColorChoice) {
                case "1":
                    System.out.println("Selected Grey.");
                    selectedChoice = "Grey";
                    i++;
                    break;
                case "2":
                    System.out.println("Selected Blue.");
                    selectedChoice = "Blue";
                    i++;
                    break;
                case "3":
                    System.out.println("Selected Black.");
                    selectedChoice = "Black";
                    i++;
                    break;
                case "4":
                    System.out.println("Selected Brown.");
                    selectedChoice = "Brown";
                    i++;
                    break;
                case "5":
                    System.out.println("Selected Red.");
                    selectedChoice = "Red";
                    i++;
                    break;
                default:
                    System.out.println("Invalid choice. Choose again.");
            }
        }
    }
    public String getSelectedChoice() {
        return selectedChoice;
    }
}
class EyeColorOption extends CharacterOption{
    private String selectedChoice;
    
	public EyeColorOption() {
		super("Eye Color");
	}
	public void customize() {
		
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {

		System.out.println("\nChoose your hunter eye color:");
		System.out.println("1 - Black");
        System.out.println("2 - Brown");
        System.out.println("3 - Blue");
        System.out.println("4 - Grey");
        System.out.println("5 - Red");
       
        String eyeColorChoice = sc.nextLine();
        switch (eyeColorChoice) {
            case "1":
                System.out.println("Black selected.");
                selectedChoice = "Black";
                i++;
                break;
            case "2":
                System.out.println("Brown selected.");
                selectedChoice = "Brown";
                i++;
                break;
            case "3":
                System.out.println("Blue selected.");
                selectedChoice = "Blue";
                i++;
                break;
            case "4":
                System.out.println("Grey selected.");
                selectedChoice = "Grey";
                i++;
                break;
            case "5":
                System.out.println("Red selected.");
                selectedChoice = "Red";
                i++;
                break;
            default:
                System.out.println("Invalid choice. Choose again.");
        }
	    }
    }
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class FaceShapeOption extends CharacterOption{
    private String selectedChoice;
    
	public FaceShapeOption() {
		super("Face Shape");
	}
	public void customize() {
		
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
		System.out.println("\nChoose your hunter face shape:");
		System.out.println("1 - Round");
		System.out.println("2 - Oval");
		System.out.println("3 - Triangle");
		System.out.println("4 - Square");
		System.out.println("5 - Diamond");
		
        String faceShapeChoice = sc.nextLine();
        switch (faceShapeChoice) {
        case "1":
            System.out.println("Round selected.");
            selectedChoice = "Round";
            i++;
            break;
        case "2":
            System.out.println("Oval selected.");
            selectedChoice = "Oval";
            i++;
            break;
        case "3":
            System.out.println("Triangle selected.");
            selectedChoice = "Triangle";
            i++;
            break;
        case "4":
            System.out.println("Square selected.");
            selectedChoice = "Square";
            i++;
            break;
        case "5":
            System.out.println("Diamond selected.");
            selectedChoice = "Diamond";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }	
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}
class SkinColorOption extends CharacterOption{
        private String selectedChoice;

	public SkinColorOption() {
		super("Skin Color");	
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
    	
		System.out.println("\nChoose your hunter skin color:");		 
	        System.out.println("1 - White");
	        System.out.println("2 - Brown");
	        System.out.println("3 - Light brown");
	        System.out.println("4 - Dark brown");
	        System.out.println("5 - Black");
	        
	        String skinColorChoice = sc.nextLine();
	        switch (skinColorChoice) {
	        case "1":
	            System.out.println("White selected.");
                    selectedChoice = "White";
	            i++;
	            break;
	        case "2":
	            System.out.println("Brown selected.");
                    selectedChoice = "Brown";
	            i++;
	            break;
	        case "3":
	            System.out.println("Light brown selected.");
                    selectedChoice = "Light Brown";
	            i++;
	            break;
	        case "4":
	            System.out.println("Dark brown selected.");
                    selectedChoice = "Dark Brown";
	            i++;
	            break;
	        case "5":
	            System.out.println("Black selected.");
                    selectedChoice = "Black";
	            i++;
	            break;
	        default:
	            System.out.println("Invalid choice. Choose again.");
	    }
	    }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class FacialHairOption extends CharacterOption {
       private String selectedChoice;
       
	public FacialHairOption() {
		super("Facial Hair");
	}
	public void customize()	{
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {   		
    	
		System.out.println("\nChoose your hunter facial hair:");
		System.out.println("1 - Mustache");
		System.out.println("2 - Chin beard");
		System.out.println("3 - Extended goatee");
		System.out.println("4 - Anchor beard");
		System.out.println("5 - Long goatee");
		System.out.println("6 - Default");
		
        String facialHairChoice = sc.nextLine();
        switch (facialHairChoice) {
        case "1":
            System.out.println("Mustache selected.");
            selectedChoice = "Mustache";
            i++;
            break;
        case "2":
            System.out.println("Chin beard selected.");
            selectedChoice = "Chin Beard";
            i++;
            break;
        case "3":
            System.out.println("Extended goatee selected.");
            selectedChoice = "Extended goatee";
            i++;
            break;
        case "4":
            System.out.println("Anchor beard selected.");
            selectedChoice = "Anchor beard";
            i++;
            break;
        case "5":
            System.out.println("Long goatee selected.");
            selectedChoice = "Long goatee";
            i++;
            break;
        case "6":
            System.out.println("Default selected.");
            selectedChoice = "Default";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
    	}
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}
class NoseOption extends CharacterOption { 
    private String selectedChoice;

	public NoseOption() {
		super("Nose");		
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		   
		System.out.println("\nChoose your hunter nose:");
		System.out.println("1 - Straight");
		System.out.println("2 - Raised");
		System.out.println("3 - Lowered");
		System.out.println("4 - Big");
		System.out.println("5 - Fleshy");
		
        String noseChoice = sc.nextLine();
        switch (noseChoice) {
        case "1":
            System.out.println("Straight selected.");
            selectedChoice = "Straight";
            i++;
            break;
        case "2":
            System.out.println("Raised selected.");
            selectedChoice = "Raised";
            i++;
            break;
        case "3":
            System.out.println("Lowered selected.");
            selectedChoice = "Lowered";
            i++;
            break;
        case "4":
            System.out.println("Big selected.");
            selectedChoice = "Big";
            i++;
            break;
        case "5":
            System.out.println("Fleshy selected.");
            selectedChoice = "Fleshy";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class ExpressionOption extends CharacterOption {
    private String selectedChoice;
	public ExpressionOption() {
		super("Expression");
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
		System.out.println("\nChoose your hunter expression:");
		System.out.println("1 - Happy");
		System.out.println("2 - Sad");
		System.out.println("3 - Angry");
		System.out.println("4 - Serious");
		System.out.println("5 - Fear");
		
        String expressionChoice = sc.nextLine();
        switch (expressionChoice) {
        case "1":
            System.out.println("Happy selected.");
            selectedChoice = "Happy";
            i++;
            break;
        case "2":
            System.out.println("Sad selected.");
            selectedChoice = "Sad";
            i++;
            break;
        case "3":
            System.out.println("Angry selected.");
            selectedChoice = "Angry";
            i++;
            break;
        case "4":
            System.out.println("Serious selected.");
            selectedChoice = "Serious";
            i++;
            break;
        case "5":
            System.out.println("Fear selected.");
            selectedChoice = "Fear";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
	    }
    }
        public String getSelectedChoice() {
        return selectedChoice;
    }
}	

class ClothingOption extends CharacterOption {
    private String selectedChoice;
    
	public ClothingOption() {
		super ("Clothing");
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
		System.out.println("\nChoose your hunter clothing:");
		System.out.println("1 - Casual");
		System.out.println("2 - Formal");
		System.out.println("3 - Bikini");
		System.out.println("4 - Topless");
		System.out.println("5 - Bottomless");
	
        String clothingChoice = sc.nextLine();
        switch (clothingChoice) {
        case "1":
            System.out.println("Casual selected.");
            selectedChoice = "Casual";
            i++;
            break;
        case "2":
            System.out.println("Formal selected.");
            selectedChoice = "Formal";
            i++;
            break;
        case "3":
            System.out.println("Swimsuit selected.");
            selectedChoice = "Swimsuit";
            i++;
            break;
        case "4":
            System.out.println("Topless selected.");
            selectedChoice = "Topless";
            i++;
            break;
        case "5":
            System.out.println("Bottomless selected.");
            selectedChoice = "Bottomless";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class BodyOption extends CharacterOption {
    private String selectedChoice;
    
	public BodyOption() {
		super("Body");
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
		System.out.println("\nChoose your hunter body:");
		System.out.println("1 - Fit");
		System.out.println("2 - Fat");
		System.out.println("3 - Bulky");
		System.out.println("4 - Thin");
		System.out.println("5 - Sexy");
	
        String bodyChoice = sc.nextLine();
        switch (bodyChoice) {
        case "1":
            System.out.println("Fit selected.");
            selectedChoice = "Fit";
            i++;
            break;
        case "2":
            System.out.println("Fat selected.");
            selectedChoice = "Fat";
            i++;
            break;
        case "3":
            System.out.println("Bulky selected.");
            selectedChoice = "Bulky";
            i++;
            break;
        case "4":
            System.out.println("Thin selected.");
            selectedChoice = "Thin";
            i++;
            break;
        case "5":
            System.out.println("Sexy selected.");
            selectedChoice = "Sexy";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class EarringsOption extends CharacterOption {
    private String selectedChoice;
    
	public EarringsOption() {
		super("Earings");	
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
		System.out.println("\nChoose your hunter earings:");
		System.out.println("1 - Feather");
		System.out.println("2 - Hoop");
		System.out.println("3 - Diamond");
		System.out.println("4 - Heart");
		System.out.println("5 - Teardrop");
		System.out.println("6 - Default");
		
        String earingsChoice = sc.nextLine();
        switch (earingsChoice) {
        case "1":
            System.out.println("Feather selected.");
            selectedChoice = "Feather";
            i++;
            break;
        case "2":
            System.out.println("Hoop selected.");
            selectedChoice = "Hoop";
            i++;
            break;
        case "3":
            System.out.println("Diamond selected.");
            selectedChoice = "Diamond";
            i++;
            break;
        case "4":
            System.out.println("Heart selected.");
            selectedChoice = "Heart";
            i++;
            break;
        case "5":
            System.out.println("Teardrop selected.");
            selectedChoice = "Teardrop";
            i++;
            break;
        case "6":
            System.out.println("Default selected.");
            selectedChoice = "Default";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class HatOption extends CharacterOption {
    private String selectedChoice;

	public HatOption() {
		super("Hat");
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
		System.out.println("\nChoose your hunter hat:");
		System.out.println("1 - Cowboy");
		System.out.println("2 - Baseball");
		System.out.println("3 - Top hat");
		System.out.println("4 - Beanie");
		System.out.println("5 - Military");
		System.out.println("6 - Default");
		
        String hatChoice = sc.nextLine();
        switch (hatChoice) {
        case "1":
            System.out.println("Cowboy selected.");
            selectedChoice = "Cowboy";
            i++;
            break;
        case "2":
            System.out.println("Baseball selected.");
            selectedChoice = "Baseball";
            i++;
            break;
        case "3":
            System.out.println("Top hat selected.");
            selectedChoice = "Top hat";
            i++;
            break;
        case "4":
            System.out.println("Beanie selected.");
            selectedChoice = "Beanie";
            i++;
            break;
        case "5":
            System.out.println("Military selected.");
            selectedChoice = "Military";
            i++;
            break;
        case "6":
            System.out.println("Default selected.");
            selectedChoice = "Default";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class NecklaceOption extends CharacterOption {
    private String selectedChoice;
    
	public NecklaceOption() {
		super("Necklace");
	}
	public void customize()	{
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
    	
		System.out.println("\nChoose your hunter necklace:");
		System.out.println("1 - Chain");
		System.out.println("2 - Collar");
		System.out.println("3 - Locket");
		System.out.println("4 - Pendant");
		System.out.println("5 - Choker");
		System.out.println("6 - Default");

		
        String neckLaceChoice = sc.nextLine();
        switch (neckLaceChoice) {
        case "1":
            System.out.println("Chain selected.");
            selectedChoice = "Chain";
            i++;
            break;
        case "2":
            System.out.println("Collar selected.");
            selectedChoice = "Collar";
            i++;
            break;
        case "3":
            System.out.println("Locket selected.");
            selectedChoice = "Locket";
            i++;
            break;
        case "4":
            System.out.println("Pendant selected.");
            selectedChoice = "Pendant";
            i++;
            break;
        case "5":
            System.out.println("Choker selected.");
            selectedChoice = "Choker";
            i++;
            break;
        case "6":
            System.out.println("Default selected.");
            selectedChoice = "Default";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class WristbandsOption extends CharacterOption {
    private String selectedChoice;
    
	public WristbandsOption() {
		super("Wrist Bands");
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
		System.out.println("\nChoose your hunter wristbands:");
		System.out.println("1 - Watch");
		System.out.println("2 - Bracelet");
		System.out.println("3 - Chain");
		System.out.println("4 - Beaded bracelet");
		System.out.println("5 - Woven bracelet");
		System.out.println("6 - Default");

		
	
        String wristBandsChoice = sc.nextLine();
        switch (wristBandsChoice) {
        case "1":
            System.out.println("Watch selected.");
            selectedChoice = "Watch";
            i++;
            break;
        case "2":
            System.out.println("Bracelet selected."); 
            selectedChoice = "Bracelet";
            i++;
            break;
        case "3":
            System.out.println("Chain selected.");
            selectedChoice = "Chain";
            i++;
            break;
        case "4":
            System.out.println("Beaded bracelet selected.");
            selectedChoice = "Beaded bracelet";
            i++;
            break;
        case "5":
            System.out.println("Woven bracelet selected.");
            selectedChoice = "Woven bracelet";
            i++;
            break;
        case "6":
            System.out.println("Default selected.");
            selectedChoice = "Default";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }		
	}
         public String getSelectedChoice() {
        return selectedChoice;
    }
}

class FootwearOption extends CharacterOption {
    private String selectedChoice;
    
	public FootwearOption() {
		super("Footwear");
	}
	public void customize()	{
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
    		
		System.out.println("\nChoose your hunter footwear:");
		System.out.println("1 - Slipper");
		System.out.println("2 - Boots");
		System.out.println("3 - Sandal");
		System.out.println("4 - Barefoot");
		System.out.println("5 - Shoes");
		
        String footWearChoice = sc.nextLine();
        switch (footWearChoice) {
        case "1":
            System.out.println("Slipper selected.");
            selectedChoice = "Slipper";
            i++;
            break;
        case "2":
            System.out.println("Boots selected.");
            selectedChoice = "Boots";
            i++;
            break;
        case "3":
            System.out.println("Sandal selected.");
            selectedChoice = "Sandal";
            i++;
            break;
        case "4":
            System.out.println("Barefoot selected.");
            selectedChoice = "Barefoot";
            i++;
            break;
        case "5":
            System.out.println("Shoes selected.");
            selectedChoice = "Shoes";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class RaceOption extends CharacterOption {
    private String selectedChoice;
    
	public RaceOption()	{
		super("Race");
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {

		System.out.println("\nChoose your hunter race:");
		System.out.println("1 - Elf");
		System.out.println("2 - Dwarf");
		System.out.println("3 - Human");
		System.out.println("4 - Demon");
		System.out.println("5 - Demi human");
	
        String raceChoice = sc.nextLine();
        switch (raceChoice) {
        case "1":
            System.out.println("Elf selected.");
            selectedChoice = "Elf";
            i++;
            break;
        case "2":
            System.out.println("Dwarf selected.");
            selectedChoice = "Dwarf";
            i++;
            break;
        case "3":
            System.out.println("Human selected.");
            selectedChoice = "Human";
            i++;
            break;
        case "4":
            System.out.println("Demon selected.");
            selectedChoice = "Demon";
            i++;
            break;
        case "5":
            System.out.println("Demi human selected.");
            selectedChoice = "Demi human";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }     
}

class RoleOption extends CharacterOption {
    private String selectedChoice;
    
	public RoleOption() {
		super("Role");
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {

		System.out.println("\nChoose your hunter role:");
		System.out.println("1 - Assassin");
		System.out.println("2 - Archer");
		System.out.println("3 - Swordsman");
		System.out.println("4 - Wizard");
		System.out.println("5 - Magic Swordsman");
	
        String roleChoice = sc.nextLine();
        switch (roleChoice) {
        case "1":
            System.out.println("Assassin selected.");
            selectedChoice = "Assassin";
            i++;
            break;
        case "2":
            System.out.println("Archer selected.");
            selectedChoice = "Archer";
            i++;
            break;
        case "3":
            System.out.println("Swordsman selected.");
            selectedChoice = "Swordsman";
            i++;
            break;
        case "4":
            System.out.println("Wizard selected.");
            selectedChoice = "Wizard";
            i++;
            break;
        case "5":
            System.out.println("Magic Swordsman selected.");
            selectedChoice = "Magic Swordsman";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class WeaponOption extends CharacterOption {
     private String selectedChoice;
     
	public WeaponOption() {
		super("Weapon");
	}
	public void customize() {
		Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 1;) {
  
		System.out.println("\nChoose your hunter weapon:");
		System.out.println("1 - Dagger");
		System.out.println("2 - Bow");
		System.out.println("3 - Staff");
		System.out.println("4 - Sword and Shield");
		System.out.println("5 - Greatsword");
;
        String weaponChoice = sc.nextLine();
        switch (weaponChoice) {
        case "1":
            System.out.println("Dagger selected.");
            selectedChoice = "Dagger";
            i++;
            break;
        case "2":
            System.out.println("Bow selected.");
            selectedChoice = "Bow";
            i++;
            break;
        case "3":
            System.out.println("Staff selected.");
            selectedChoice = "Staff";
            i++;
            break;
        case "4":
            System.out.println("Sword and Shield selected.");
            selectedChoice = "Sword and Shield";
            i++;
            break;
        case "5":
            System.out.println("Greatsword selected.");
            selectedChoice = "Greatsword";
            i++;
            break;
        default:
            System.out.println("Invalid choice. Choose again.");
        }
        }
	}
        public String getSelectedChoice() {
        return selectedChoice;
    }
}

class HeightOption extends CharacterOption {
    private String selectedChoice;
    
    public HeightOption() {
        super("Height");
    }

    public void customize() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1;) {
            System.out.println("\nChoose your hunter height: ");
            System.out.println("1 - 40%");
            System.out.println("2 - 70%");
            System.out.println("3 - 100%");
            System.out.println("4 - 120%");
            
            String heightChoice = sc.nextLine();
            
            switch (heightChoice) {
            case "1":
            	System.out.println("Selected height 40%. ");
                selectedChoice = "40%";
            	i++;
            	break;
            case "2":
            	System.out.println("Selected height 70%. ");
                selectedChoice = "70%";
            	i++;
            	break;
            case "3":
            	System.out.println("Selected height 100%. ");
                selectedChoice = "100%";
            	i++;
            	break;
            case "4":
            	System.out.println("Selected height 120%. ");
                selectedChoice = "120%";
            	i++;
            	break;
            	default:
            		System.out.println("Invalid choice. Choose again.");
            }
        }
    }
    public String getSelectedChoice() {
            return selectedChoice;
        }
}
class ConsolePlayer implements Player {
    private final String name;

    public ConsolePlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class consoleGame implements Player, Customizable {
    private final ConsolePlayer player;

    public consoleGame(String playerName) {
        this.player = new ConsolePlayer(playerName);
        
    }
    
    private String selectedGender;
    private String selectedRace;
    private String selectedHairstyle;
    private String selectedHairColor;
    private String selectedFaceShape;
    private String selectedFacialHair;
    private String selectedExpression;
    private String selectedNose;
    private String selectedEyeColor;
    private String selectedBody;
    private String selectedSkinColor;
    private String selectedHeight;
    private String selectedHat;
    private String selectedEarrings;
    private String selectedNecklace;
    private String selectedClothing;
    private String selectedWristbands;
    private String selectedFootwear;
    private String selectedRole;
    private String selectedWeapon;
    
    public void startGame() {
       
    }

    @Override
    public void customize() {
    CharacterOption genderOption = new GenderOption();
    CharacterOption raceOption = new RaceOption();
    CharacterOption heightOption = new HeightOption();
    CharacterOption hairstyleOption = new HairstyleOption();
    CharacterOption hairColorOption = new HairColorOption();
    CharacterOption faceShapeOption = new FaceShapeOption();
    CharacterOption facialHairOption = new FacialHairOption();
    CharacterOption expressionOption = new ExpressionOption();
    CharacterOption noseOption = new NoseOption();
    CharacterOption eyeColorOption = new EyeColorOption();
    CharacterOption bodyOption = new BodyOption();
    CharacterOption skinColorOption = new SkinColorOption();
    CharacterOption hatOption = new HatOption();
    CharacterOption earringsOption = new EarringsOption();
    CharacterOption necklaceOption = new NecklaceOption();
    CharacterOption clothingOption = new ClothingOption();
    CharacterOption wristbandsOption = new WristbandsOption();
    CharacterOption footWearOption = new FootwearOption();
    CharacterOption roleOption = new RoleOption();
    CharacterOption weaponOption = new WeaponOption();

    genderOption.customize();
    selectedGender = ((GenderOption) genderOption).getSelectedChoice();

    raceOption.customize();
    selectedRace = ((RaceOption) raceOption).getSelectedChoice();
    
    heightOption.customize();
    selectedHeight = ((HeightOption) heightOption).getSelectedChoice();

    hairstyleOption.customize();
    selectedHairstyle = ((HairstyleOption) hairstyleOption).getSelectedChoice();

    hairColorOption.customize();
    selectedHairColor = ((HairColorOption) hairColorOption).getSelectedChoice();

    faceShapeOption.customize();
    selectedFaceShape = ((FaceShapeOption) faceShapeOption).getSelectedChoice();

    facialHairOption.customize();
    selectedFacialHair = ((FacialHairOption) facialHairOption).getSelectedChoice();

    expressionOption.customize();
    selectedExpression= ((ExpressionOption) expressionOption).getSelectedChoice();

    noseOption.customize();
    selectedNose = ((NoseOption) noseOption).getSelectedChoice();

    eyeColorOption.customize();
    selectedEyeColor = ((EyeColorOption) eyeColorOption).getSelectedChoice();

    bodyOption.customize();
    selectedBody = ((BodyOption) bodyOption).getSelectedChoice();

    skinColorOption.customize();
    selectedSkinColor = ((SkinColorOption) skinColorOption).getSelectedChoice();

    hatOption.customize();
    selectedHat = ((HatOption) hatOption).getSelectedChoice();

    earringsOption.customize();
    selectedEarrings = ((EarringsOption) earringsOption).getSelectedChoice();

    necklaceOption.customize();
    selectedNecklace = ((NecklaceOption) necklaceOption).getSelectedChoice();

    clothingOption.customize();
    selectedClothing = ((ClothingOption) clothingOption).getSelectedChoice();

    wristbandsOption.customize();
    selectedWristbands = ((WristbandsOption) wristbandsOption).getSelectedChoice();

    footWearOption.customize();
    selectedFootwear = ((FootwearOption) footWearOption).getSelectedChoice();

    roleOption.customize();
    selectedRole = ((RoleOption) roleOption).getSelectedChoice();

    weaponOption.customize();
    selectedWeapon = ((WeaponOption) weaponOption).getSelectedChoice();
}
    private static void printEffect(String print){
    	for(int i=0;i<print.length();i++) {
    		char sample = print.charAt(0+i);
    		System.out.print(sample);
    		try {
    			Thread.sleep(35);
    		}catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    }
       
    public void play() {
    	
    	System.out.println("\n--- Selected Features for " + player.getName() + " ---");
        System.out.println("Gender: " + selectedGender);
        System.out.println("Race: " + selectedRace);
        System.out.println("Height: " + selectedHeight);
        System.out.println("Hairstyle: " + selectedHairstyle);
        System.out.println("HairColor: " + selectedHairColor);
        System.out.println("FaceShape: " + selectedFaceShape);
        System.out.println("FacialHair: " + selectedFacialHair);
        System.out.println("Expression: " + selectedExpression);
        System.out.println("Nose: " + selectedNose);
        System.out.println("Eye Color: " + selectedEyeColor);
        System.out.println("Body: " + selectedBody);
        System.out.println("Skin Color: " + selectedSkinColor);
        System.out.println("Hat: " + selectedHat);
        System.out.println("Earrings: " + selectedEarrings);
        System.out.println("Necklace: " + selectedNecklace);
        System.out.println("Clothing: " + selectedClothing);
        System.out.println("Wristbands: " + selectedWristbands);
        System.out.println("Footwear: " + selectedFootwear);
        System.out.println("Role: " + selectedRole);
        System.out.println("Weapon: " + selectedWeapon);
        System.out.println("");
        
    	
    	boolean validChoice = false;
        while (!validChoice) {
        System.out.print("\nDo you want to play right away the Iceborne expansion? (Y/N): ");
        Scanner sc = new Scanner(System.in);
        String expansionChoice = sc.nextLine();

        if (expansionChoice.equalsIgnoreCase("Y")) {
            System.out.println("\n	--- Monster Hunter World: Iceborne DLC ---	");
            printEffect("\nIn the frozen tundra of the Hoarfrost Reach, a new threat emerges. "
            		+ "\nAn elder dragon, Velkhana, spreads its icy influence, causing a disturbance in the New World."
            		+ "\nAs a skilled hunter, you are summoned to uncover the mysteries hidden in the snow and "
            		+ "\nconfront this formidable creature.");
            validChoice = true;
        } else if (expansionChoice.equalsIgnoreCase("N")) {
            System.out.println("\n	--- Monster Hunter World ---	");
            printEffect("\nWelcome to the New World, where diverse ecosystems and powerful monsters await. "
            		+ "\nAs a hunter, you join the Research Commission to explore uncharted territories, "
            		+ "\nstudy wildlife and face the colossal monsters that roam the lands. "
            		+ "\nYour journey is about to begin!");
            validChoice = true;
        } else {
            System.out.println("Invalid choice. Please enter Y or N.");
        }
    }
}

    public String getName() {
        return player.getName();
    }
}
public class Mhwgame {
    public static void main(String[] args) {
        System.out.println("       | MONSTER HUNTER WORLD: ICEBORNE |         ");
        System.out.println("       __________________________________  ");
        System.out.print("Enter your character name: ");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.nextLine();

        consoleGame game = new consoleGame(playerName);
        game.startGame();       
        game.customize();
        game.play();
    }
 }
