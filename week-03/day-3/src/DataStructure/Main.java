package DataStructure;

public class Main {

    public static void main(String[] args) {
        PostIt postIt1 = new PostIt();
        postIt1.backgroundColor = "orange";
        postIt1.textColor = "blue";
        postIt1.text = "Idea 1";

        PostIt postIt2 = new PostIt();
        postIt2.backgroundColor = "pink";
        postIt2.textColor = "black";
        postIt2.text = "Awesome";

        Blog myBlog = new Blog();

        myBlog.newPost("John Doe","Lorem Ipsum");
        myBlog.newPost("Tim Urban","Wait but why");
        myBlog.newPost("William Turton","One Engineer Is Trying to Get IBM to Reckon With Trump");

        myBlog.blogPostList.get(0).text = "Lorem ipsum dolor sit amet.";
        myBlog.blogPostList.get(0).publicationDate = "2000.05.04";

        myBlog.blogPostList.get(1).text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        myBlog.blogPostList.get(1).publicationDate = "2000.10.10";

        myBlog.blogPostList.get(2).text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        myBlog.blogPostList.get(2).publicationDate = "2017.03.28";

        System.out.println(myBlog.blogPostList.get(0).text);

        myBlog.delete(1);

        System.out.println(myBlog.blogPostList.size());

        myBlog.update(0,myBlog.blogPostList.get(1));

        System.out.println(myBlog.blogPostList.get(0).text);
    }



}
