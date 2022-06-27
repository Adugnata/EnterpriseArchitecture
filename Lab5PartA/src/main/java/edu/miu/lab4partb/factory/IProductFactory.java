package edu.miu.lab4partb.factory;

import edu.miu.lab4partb.domain.Book;
import edu.miu.lab4partb.domain.CD;
import edu.miu.lab4partb.domain.DVD;

public  interface IProductFactory {
   CD createCD(String name, double price, String artist);
   DVD createDVD(String name, double price, String genre);
   Book createBook(String name, double price, long isbn);
}
