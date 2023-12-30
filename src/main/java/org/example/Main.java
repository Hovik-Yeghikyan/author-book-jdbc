package org.example;

import org.example.db.DBConnectionProvider;
import org.example.manager.AuthorManager;
import org.example.model.Author;

import java.util.List;

public class Main {

    private static AuthorManager authorManager = new AuthorManager();

    public static void main(String[] args) {

        Author author = new Author("poxosuhi","polo","poxos@mail.com",23);
        authorManager.add(author);
//        System.out.println(author);

//        List<Author> allAuthors = authorManager.getAllAuthors();
//        for (Author allAuthor : allAuthors) {
//            System.out.println(allAuthor);
//        }

//        Author authorById = authorManager.getAuthorById(3);
//        System.out.println(authorById);
//
//        authorManager.deleteAuthorById(3);
//
//        System.out.println(authorManager.getAuthorById(3));

      //  authorManager.updateAuthor(author);

    }
}