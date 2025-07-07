class Tiger implements Animal{
	 @Override
	 public void run(){
		System.out.println("Tiger running speed 60kmph");
	 }
	 @Override
	 public  void eat(){
		System.out.println("Tiger eating deer");
	 }
	 @Override
	 public  void dance(){
		System.out.println("Tiger dancing in rain");
	 }

}

class Lion implements Animal{
	 @Override
	 public void run(){
		System.out.println("Lion running speed 50kmph");
	 }
	 @Override
	 public  void eat(){
		System.out.println("Lion eating bear");
	 }
	 @Override
	 public  void dance(){
		System.out.println("Lion dancing in forest");
	 }



}