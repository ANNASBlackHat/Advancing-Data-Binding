package com.annasblackhat.advancingdatabinding;

import com.annasblackhat.advancingdatabinding.model.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by annasblackhat on 25/03/17.
 */

public class Content {

    public Post getSinglePost(){
        Post post = new Post();
        post.setImg("https://specials-images.forbesimg.com/imageserve/604358102/960x0.jpg?fit=scale");
        post.setTitle("What Is The Best Way To Learn Machine Learning Without Taking Any Online Courses?");
        post.setAdmin("Destission");
        post.setTgl("Wednesday, 29 January 2017");
        post.setContent("The Deep Learning field has dramatically expanded in the last few years, to the point where it’s not realistic to grok all the subfields of Deep Learning in a short amount of time. I recommend diving deep into one particular subfield, and then it becomes easier to learn the other subfields once you’ve mastered one area. These fields do not have that much in common anymore, besides the fact that they all utilize the expressive power of deep learning to learn tasks end-to-end, and are of a generally experimental flavor (rather than theoretical Computer Science).");
        return post;
    }

    public List<Post> getManyPost(){
        List<Post> postList = new ArrayList<>();

        Post post = new Post();
        post.setImg("https://specials-images.forbesimg.com/imageserve/604358102/560x0.jpg?fit=scale");
        post.setTitle("What Is The Best Way To Learn Machine Learning Without Taking Any Online Courses?");
        post.setAdmin("Destission");
        post.setTgl("Wednesday, 29 January 2017");
        post.setContent("The Deep Learning field has dramatically expanded in the last few years, to the point where it’s not realistic to grok all the subfields of Deep Learning in a short amount of time. I recommend diving deep into one particular subfield, and then it becomes easier to learn the other subfields once you’ve mastered one area. These fields do not have that much in common anymore, besides the fact that they all utilize the expressive power of deep learning to learn tasks end-to-end, and are of a generally experimental flavor (rather than theoretical Computer Science).");
        postList.add(post);

        post = new Post();
        post.setImg("https://blogs-images.forbes.com/curtissilver/files/2017/03/home-1200x929.jpg?width=560");
        post.setTitle("How Post Intelligence Uses AI And Deep Learning To Help You Not Suck On Social Media");
        post.setAdmin("Annas BlackHat");
        post.setTgl("Thursday, 30 January 2017");
        post.setContent("Post Intelligence isn't just some janky app that dumps a bunch of trending topics in your lap for you to tweet about. Instead, Post Intelligence analyzes your tweets (if you've got any to analyze) through deep learning artificial intelligence. Over time it recognizes your tone, quirks and suggests topics and themes to tweet about.");
        postList.add(post);

        post = new Post();
        post.setImg("https://specials-images.forbesimg.com/imageserve/652760118/960x0.jpg?fit=scale");
        post.setTitle("Here's How Pharma Is Using AI Deep Learning To Cure Aging");
        post.setAdmin("Gideon");
        post.setTgl("Saturday, 21 March 2017");
        post.setContent("In 2011, scientists made one of the most important discoveries in the history of AI development. They found that graphics processing units (GPUs) are far better at simulating biological learning than central processing units (CPUs).\n" +
                "\n" +
                "In retrospect, it seems obvious. Human brains are much more like GPUs than CPUs. Both brains and GPUs rely on parallel processing that simulates and predicts real world physics.\n" +
                "\n" +
                "In light of this, AI developers created powerful deep neural networks (DNNs) that emulate human brain function. All the major advances in self-driving cars and language translation are the result of this.");
        postList.add(post);

        post = new Post();
        post.setImg("https://d267cvn3rvuq91.cloudfront.net/i/images/aix2760.jpg?sw=1180&cx=0&cy=0&cw=2759&ch=1552");
        post.setTitle("Machine Learning Opens Up New Ways to Help Disabled People");
        post.setAdmin("Berry Allen");
        post.setTgl("Monday, 12 March 2017");
        post.setContent("YouTube has used speech-to-text software to automatically caption speech in videos since 2009 (they are used 15 million times a day). Today it rolled out algorithms that indicate applause, laughter, and music in captions. More sounds could follow, since the underlying software can also identify noises like sighs, barks, and knocks. \n The company says user tests indicate that the feature significantly improves the experience of the deaf and hard of hearing (and anyone who needs to keep the volume down). “Machine learning is giving people like me that need accommodation in some situations the same independence as others,” says Liat Kaver, a product manager at YouTube who is deaf.");
        postList.add(post);

        post = new Post();
        post.setImg("https://specials-images.forbesimg.com/imageserve/604358102/960x0.jpg?fit=scale");
        post.setTitle("What Is The Best Way To Learn Machine Learning Without Taking Any Online Courses?");
        post.setAdmin("Sarah Lance");
        post.setTgl("Friday, 22 June 2017");
        post.setContent("The Deep Learning field has dramatically expanded in the last few years, to the point where it’s not realistic to grok all the subfields of Deep Learning in a short amount of time. I recommend diving deep into one particular subfield, and then it becomes easier to learn the other subfields once you’ve mastered one area. These fields do not have that much in common anymore, besides the fact that they all utilize the expressive power of deep learning to learn tasks end-to-end, and are of a generally experimental flavor (rather than theoretical Computer Science).");
        postList.add(post);

        return postList;
    }
}
