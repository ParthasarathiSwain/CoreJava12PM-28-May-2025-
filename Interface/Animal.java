interface Animal{
 	 public static final int x=0;
//	 static{}//not allowed
	 int y=80;
	
//	 void sleep(){ }

	 public void run();
	 public abstract void eat();
	 public abstract void dance();

	 public static void walk(){ }
	 default void attack(){ }
}