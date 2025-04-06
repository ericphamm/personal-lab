package eric.pham.springblog.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ArticleDTO {
    @NotBlank(message = "Vyplnte titulek")
    @Size(max = 100, message = "Titulek je prilis dlouhy")
    private String title;

    @NotBlank(message = "Vyplnte popisek")
    private String description;

    @NotBlank(message = "Vyplnte obsah")
    private String content;

    //getter and setter
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public @NotBlank(message = "Vyplnte popisek") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Vyplnte popisek") String description) {
        this.description = description;
    }

    public @NotBlank(message = "Vyplnte obsah") String getContent() {
        return content;
    }

    public void setContent(@NotBlank(message = "Vyplnte obsah") String content) {
        this.content = content;
    }
}
