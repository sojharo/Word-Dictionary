
package dictionarymain;


public class hashtable {
	
	links[] hash1;
	int size=26;
	hashtable()
	{
		hash1=new links[size];
		for(int i=0;i<size;i++)
		{
			hash1[i]=new links();
		}
	}
	
	public void insert(String word, String definition)
	{
               int hashindex=this.setIndex(word);
            
		hash1[hashindex].insert(word, definition);
	}
        
        public links getWordList(String b)
        {
            return hash1[this.setIndex(b)];
        }
	
	public String search(String key)
	{
		int hashindex=this.setIndex(key);
		Node Temp;
		Temp=hash1[hashindex].Head;
		
		if(Temp.Data.equals(key))
		{
			return Temp.Data;
		}
		
		while((Temp!=null)&&(!Temp.Data.equals(key)))
		{
			Temp=Temp.next;
			
		}
		if(Temp!=null)
		{
			return Temp.Data;
			
		}
		else
		{
			return "Not found";
		}
		
	}
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(i+"index");
			Node Temp = hash1[i].Head;
			while(Temp!=null)
			{
				System.out.println(Temp.Data);
				Temp=Temp.next;
			}
		}
	}
	
        
        public int setIndex(String word)
        {
            int hashindex=0;
            
            char a=word.charAt(0);
            
            if(a=='a' || a=='A')
		hashindex=0;
            if(a=='b' || a=='B')
		hashindex=1;
            if(a=='c' || a=='C')
		hashindex=2;
            if(a=='d' || a=='D')
		hashindex=3;
            if(a=='e' || a=='E')
		hashindex=4;
            if(a=='f' || a=='F')
		hashindex=5;
            if(a=='g' || a=='G')
		hashindex=6;
            if(a=='h' || a=='H')
		hashindex=7;
            if(a=='i' || a=='I')
		hashindex=8;
            if(a=='j' || a=='J')
		hashindex=9;
            if(a=='k' || a=='K')
		hashindex=10;
            if(a=='l' || a=='L')
		hashindex=11;
            if(a=='m' || a=='M')
		hashindex=12;
            if(a=='n' || a=='N')
		hashindex=13;
            if(a=='o' || a=='O')
		hashindex=14;
            if(a=='p' || a=='P')
		hashindex=15;
            if(a=='q' || a=='Q')
		hashindex=16;
            if(a=='r' || a=='R')
		hashindex=17;
            if(a=='s' || a=='S')
		hashindex=18;
            if(a=='t' || a=='T')
		hashindex=19;
            if(a=='u' || a=='U')
		hashindex=20;
            if(a=='v' || a=='V')
		hashindex=21;
            if(a=='w' || a=='W')
		hashindex=22;
            if(a=='x' || a=='X')
		hashindex=23;
            if(a=='y' || a=='Y')
		hashindex=24;
            if(a=='z' || a=='Z')
		hashindex=25;
            
            return hashindex;
        }
	
}
