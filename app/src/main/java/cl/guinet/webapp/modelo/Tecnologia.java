package cl.guinet.webapp.modelo;

/**
 * Created by ricardo.gutierrez on 12/08/2016.
 */
public class Tecnologia {

    String title;
    String description;
    String image;

    public Tecnologia(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
