public class Parse {
	
	private String[] countryCodes = new String[GameData.NUM_COUNTRIES];
	private boolean isError = false;
	private boolean isError2 = false;
	private boolean isError3 = false;
	private int countryId = 0;
	private boolean isDone = false;
	private int numUnits;
	
	Parse () {
		String name;
		for (int i=0; i<GameData.NUM_COUNTRIES; i++) {
			name = GameData.COUNTRY_NAMES[i];
			name = name.toLowerCase();
			name = name.replaceAll("\\s",""); // removes all the occurrences of white spaces
			name = name.substring(0,4);
			countryCodes[i] = name;
		}
		return;
	}
	
	public void countryId (String string) {
		  boolean found = false;
            boolean found2 = true;
            boolean found3 = true;
            int num=0;
            if(string.matches(".\\d.")) {
                String number = string.replaceAll("[^0-9]", "");
                num = Integer.parseInt(number);
            }
            if(num!=3) {
                found3 = false;
                found = true;
            }
            else {
                string = string.replaceAll("\\s", "");
                string = string.replaceAll("\\d","");
                if (string.length() >= 4) {
                    string = string.toLowerCase();
                    string = string.substring(0,4);
                    for (int i=0; (i<GameData.NUM_COUNTRIES) && !found; i++) {
                        if (string.equals(countryCodes[i])) {
                            found = true;
                            countryId = i;
                        }
                    }
                }
            }
            isError = !found;
            isError2 = !found2;
            isError3 = !found3;
            return;
        }
		
	
	public void countryId2 (String string) {
		boolean found = false;
		string = string.replaceAll("\\s", "");
		if (string.length() >= 4) {
			string = string.toLowerCase();
			string = string.substring(0,4);
	 		for (int i=0; (i<GameData.NUM_COUNTRIES) && !found; i++) {
				if (string.equals(countryCodes[i])) {
					found = true;
					countryId = i;
				}
	 		}
		}
		isError = !found;
		return;
	}
	
	public boolean isError () {
		return isError;
	}
	
	public boolean isError2 () {
		return isError2;
	}
	
	public boolean isError3 () {
		return isError3;
	}
	
	public boolean isDone () {
		return isDone;
	}
	
	public int getCountryId () {
		return countryId;
	}
	
	public int getNumUnits () {
		return numUnits;
	}

}
