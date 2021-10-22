package com.cd;

public class Gorilla extends Mammal {
	public Gorilla( int energyLevel ){
        super( energyLevel);
    }

	public void throwSomething(){
		this.energyLevel = this.energyLevel -5;
		System.out.println( "The gorilla has thrown something and decreases its energy by 5");
}

	public void eatBananas(){
		this.energyLevel = this.energyLevel+ 10;
		System.out.println( "The gorilla has eated the bananas, he is very happy about it, and increase its energy by 10");
}

	public void climb(){
		this.energyLevel = this.energyLevel - 10;
		System.out.println( "The gorilla has climbed a tree and decrease its energy by 10");
}   

}
