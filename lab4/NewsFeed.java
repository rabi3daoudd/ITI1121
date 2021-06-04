/* *
 * Use static array for NewsFeed
 * with constant MAX_SIZE
 * */

public class NewsFeed {

    private Post[] messages;
    private int size;
    public static final int MAX_SIZE = 25;

    public NewsFeed() {
		// Your code here.
		this.messages = new Post[MAX_SIZE];
		this.size = 0;
    }

    public void add(Post message) {
      	// Your code here.
		if (size < MAX_SIZE) {
			messages[size()] = message;
			size++;
		}
    }

    public Post get(int index) {
	     return messages[index];
    }

    public int size() {
	     return size;
    }

	  public void sort(){
			int i, j, argMin;
			Post tmp;
			for (i = 0; i < size - 1; i++) {
				argMin = i;
				for (j = i + 1; j < size(); j++) {
					if (messages[j].compareTo(messages[argMin]) < 0) {
						argMin = j;
					}
				}

  			tmp = messages[argMin];
  			messages[argMin] = messages[i];
  			messages[i] = tmp;
		  }

	  }

  	public NewsFeed getPhotoPost(){
  		// Your code here
		NewsFeed photo = new NewsFeed();
		for(int i = 0; i < size(); i++) {
			if(this.get(i).getClass().getName().equals("PhotoPost")) {
				photo.add(this.get(i));
			}
		}
		return photo;
	}

  	public NewsFeed plus(NewsFeed other){

  	  	// Your code here
		NewsFeed feed = new NewsFeed();

		System.arraycopy(this.messages, 0, feed.messages, 0, this.size);
		System.arraycopy(other.messages, 0, feed.messages, this.size, other.size);

		feed.size = this.size + other.size;
		feed.sort();

		return feed;
	}

}
