package lesson9.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Author{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    Author(String name){this.name = name;}
}
public class Article {
    private List<Author> listOfAuthors;
    private int id;
    private String name;

    Article(String name){
        this.name  = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                "}\n";
    }

    public List<Author> getListOfAuthors() {
        return listOfAuthors;
    }

    public void setListOfAuthors(List<Author> listOfAuthors) {
        this.listOfAuthors = listOfAuthors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        List<Article> articles = Stream.generate(()->new Article("Java"))
                .limit(200)
                .collect(Collectors.toList());
        System.out.println(articles);

        Spliterator<Article> spliterator= articles.spliterator();
        //while(spliterator.tryAdvance(article -> article.setName(article.getName().concat(" - published by Hadush"))));
        //spliterator.forEachRemaining(article -> article.setName(article.getName().concat(" - published by Hadush")));
        Spliterator<Article> spliterator1 = spliterator.trySplit();

        List<Article> articles1 = new ArrayList<>();
        List<Article> articles2 = new ArrayList<>();

        //spliterator1.forEachRemaining(article -> articles1.add(article));
        spliterator1.forEachRemaining(articles1::add);

        System.out.println(articles);
    }

    // standard constructors/getters/setters
}