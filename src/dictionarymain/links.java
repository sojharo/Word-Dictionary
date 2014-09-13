
package dictionarymain;

public class links {
	
		
	Node Head;
	
	links()
	{
		Head=null;
		
	}
	
	public Boolean isEmpty()
	{
		if(Head==null)
			return true;
		else return false;
	}
	
	public Boolean Find(String item)
	{
		Node Temp=Head;
		if(!(isEmpty()))
		{
			while(Temp!=null)
			{
				if(Temp.Data.equals(item))
				{
				    return(true);
			    }
				else
					Temp=Temp.next;
			}
		}
		return(false);
		
	}
	
	
	public void Delete(String item)
	{
		
		if (Head.Data.equals(item))
			Head=Head.next;
		else{
			Node Temp=Head;
			Node Prev=Head;
				while((Temp!=null)&&!(Temp.Data.equals(item)))
					{     Prev=Temp;
						Temp=Temp.next;
					}
				if(Temp.Data.equals(item))
				{
				   Prev.next=Temp.next;
				}
				
			} 
	}
	
	public void insert(String word, String definition)
	{
		Node newNode=new Node(word, definition);
		
		if(Head==null)
		{
			Head=newNode;
		
		}
		
		else{
			Node Temp=Head;
			Node Prev=Head;
			
			while(Temp!=null)
			{
				Prev=Temp;
				Temp=Temp.next;
			}
			Prev.next=newNode;
		}
	}
	
    public void Display()
    {
	Node Temp=Head;
	while(Temp!=null)
	{
		System.out.println(Temp.Data);
		Temp=Temp.next;
	}
    }
    
    public String[] makeArray()
    {
        
        String []array=new String[this.Size()];
        
	Node Temp=Head;
        int i=0;
	while(Temp!=null)
	{
		array[i]=Temp.Data;
		Temp=Temp.next;
                i++;
	}
        
        return array;
    }
    
    public String[] makeArrayDefinitions()
    {
        
        String []array=new String[this.Size()];
        
	Node Temp=Head;
        int i=0;
	while(Temp!=null)
	{
		array[i]=Temp.Definition;
		Temp=Temp.next;
                i++;
	}
        
        return array;
    }
    
    public int Size()
    {
        int size=0;
	Node Temp=Head;
	while(Temp!=null)
	{
		System.out.println(Temp.Data);
                size++;
		Temp=Temp.next;
	}
        
        return size;
    }
	

}