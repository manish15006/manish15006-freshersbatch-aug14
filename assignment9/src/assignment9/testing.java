package assignment9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<fruit>fruits=Arrays.asList(new fruit("apple",70,10,"red"),
				new fruit("strawberry",120,50,"red"),
				new fruit("promagant",22,25,"red"),
				new fruit("orange",60,5,"orange"),
				new fruit("bananana",112,3,"yellow"),
				new fruit("grapes",50,7,"green"));
		/*display the fruit name of low calories fruits i.e. calories<100 sorted in
		descending order of calories*/
		List<String>lowcalories=fruits.stream().filter(fruit->fruit.getCalories()< 100)
				.map(fruit->fruit.getName()).sorted((o1,o2)-> o2.compareTo(o1)).collect(Collectors.toList());
				//.sorted(comparing(fruit::getCalories)).collect(toList());
		System.out.println(lowcalories);
		System.out.println("*******************");
		//display color wise list of fruit names
		System.out.println("display color wise list of fruit names");
		
		fruits.forEach(fruit->System.out.println("color wise list of fruit :\n"+"color: "+fruit.getColor()+"|"+"name: "+fruit.getName()));
		System.out.println("*******************");
		//display red color fruits sorted as per their price in ascending order
		List<String>redcolor=fruits.stream().filter(fruit->fruit.getColor()== "red")
				.map(fruit->fruit.getName()).sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList());
		
		System.out.println(redcolor);
		
		System.out.println("**----------------------------------------------------**");
        Trader prasad = new Trader("prasad", "delhi");
        Trader nitish = new Trader("nitish", "indore");
        Trader kiran = new Trader("kiran", "pune");
        Trader naveen = new Trader("naveen", "pune");
        
        List<Transaction> transactions = Arrays.asList(new Transaction(kiran, 2011, 300),
                new Transaction(naveen, 2012, 1000), 
                new Transaction(naveen, 2011, 400),
                new Transaction(prasad, 2012, 710), 
                new Transaction(prasad, 2012, 700), 
                new Transaction(nitish, 2012, 9500));
        
        		//Find all transactions from year 2011 and sort them by value (small to high).
        		List<Transaction> tr2011 = transactions.stream()
        				.filter(transaction -> transaction.getYear() == 2011)
        				.sorted(comparing(Transaction::getValue))
        				.collect(toList());
        		System.out.println(tr2011);
        		//What are all the unique cities where the traders work
        		List<String>cities=transactions.stream().map(transaction->transaction.getTrader().getCity()).distinct().collect(toList());
        		System.out.println(cities);
        		//Find all traders from pune and sort them by name
        		List<Trader>traders=transactions.stream().map(Transaction::getTrader).filter(trader->trader.getCity().equals("pune")).distinct().sorted(comparing(Trader::getName)).collect(toList());
        		System.out.println(traders);
        		//Return a string of all traders’ names sorted alphabetically
        		String traderStr = 
        				transactions.stream()
        	                        .map(transaction -> transaction.getTrader().getName())
        	                        .distinct()
        	                        .sorted()
        	                        .reduce("", (n1, n2) -> n1 + n2);
        	    System.out.println(traderStr);
        	    //Are there any trader based in indore
        	    boolean puneBased =
        	            transactions.stream()
        	                        .anyMatch(transaction -> transaction.getTrader()
        	                                                            .getCity()
        	                                                            .equals("indore"));
        	    System.out.println(puneBased);
        	    //What's the highest value in all the transactions
        	    int highestValue = 
        	            transactions.stream()
        	                        .map(Transaction::getValue)
        	                        .reduce(0, Integer::max);
        	    System.out.println(highestValue); 
        	    //print all transcations values from the traders living in delhi
        	    transactions.stream()
                			.map(Transaction::getTrader)
                			.filter(trader -> trader.getCity().equals("delhi"));
        	    System.out.println(transactions);
        	    //smallest value in transcation
        	    int smallestValue = 
        	            transactions.stream()
        	                        .map(Transaction::getValue)
        	                        .min(Integer::compare).get();
        	    System.out.println(smallestValue); 
	}

}

