package DataStructure;

public class main {

    public static void main(String[] args) {
        PostIt postIt1 = new PostIt();
        postIt1.backgroundColor = "orange";
        postIt1.textColor = "blue";
        postIt1.text = "Idea 1";

        PostIt postIt2 = new PostIt();
        postIt2.backgroundColor = "pink";
        postIt2.textColor = "black";
        postIt2.text = "Awesome";

        BlogPost post1 = new BlogPost();
        post1.AuthorName ="John Doe";
        post1.title = "Lorem Ipsum";
        post1.text = "Lorem ipsum dolor sit amet.";
        post1.publicationDate = "2000.05.04";

        BlogPost post2 = new BlogPost();
        post1.AuthorName ="Tim Urban";
        post1.title = "Wait but why";
        post1.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        post1.publicationDate = "2000.10.10";

        BlogPost post3 = new BlogPost();
        post1.AuthorName ="William Turton";
        post1.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        post1.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        post1.publicationDate = "2017.03.28";
    }



}
