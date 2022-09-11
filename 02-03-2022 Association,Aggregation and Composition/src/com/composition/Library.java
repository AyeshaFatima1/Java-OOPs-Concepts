package com.composition;
	
	import java.util.ArrayList;
	import java.util.List;

	public class Library 
	{
		private final List<Book> books;
		 
	    // Library class contains list of books
	    public Library(List<Book> books)
	    {
	        this.books = books;
	    }
	 
	    // Method
	    // To get total number of books in library
	    public List<Book> getTotalBooksInLibrary()
	    {
	 
	        return books;
	    }
	    public static void main(String[] args) 
	   {
	   	 // Creating objects of Book class inside main()
	     // method Custom inputs
	        Book b1= new Book("EffectiveJ Java", "Joshua Bloch");
	        Book b2= new Book("Thinking in Java", "Bruce Eckel");
	        Book b3 = new Book("Java: The Complete Reference","Herbert Schildt");
	 
	     // Creating the list which contains number of books
	        List<Book> books = new ArrayList<Book>();
	        books.add(b1);
	        books.add(b2);
	        books.add(b3);
	 
	        Library library = new Library(books);
	 
	        
	        List<Book> bks = library.getTotalBooksInLibrary();
	 
	        // Iterating over books using for each loop
	        for (Book bk : bks) {
	 
	           
	            System.out.println("Title : " + bk.title+ " and " + " Author : " + bk.author);
	        }
	    }

	   }

