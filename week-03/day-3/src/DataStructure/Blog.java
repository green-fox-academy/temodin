package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPostList = new ArrayList<>();

    public void newPost (String AuthorName, String title) {
        BlogPost post = new BlogPost(AuthorName,title);
        blogPostList.add(post);
    }

    public void delete (int indexOfPostToDelete) {
        blogPostList.remove(indexOfPostToDelete);
    }

    public void update (int indexOfPostToUpdate, BlogPost post) {
        blogPostList.set(indexOfPostToUpdate,post);
    }
    }
