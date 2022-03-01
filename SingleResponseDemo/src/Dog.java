
	public class Dog {

		protected String dogType;
		protected String colour;
		private boolean isMale;
		
		public Dog(String dogType, String colour, boolean isMale) {
			super();
			this.dogType = dogType;
			this.setColour(colour);
			this.isMale = isMale;
		}


		public boolean isMale() {
			return isMale;
		}

		public void setMale(boolean isMale) {
			this.isMale = isMale;
		}
		
		public void speak() {
			System.out.println("Woof woof");
		}


		public String getColour() {
			return colour;
		}


		public void setColour(String colour) {
			this.colour = colour;
		}
		
		
	}

