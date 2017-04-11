package pri.Mark.ext.model;

import java.util.Date;

public class Picture {
    private Integer pictureId;

    private Date pictureInputtime;

    private Date pictureDeletetime;

    private String pictureName;

    private String pictureOwner;

    private Integer pictureType;

    private String picturePath;

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public Date getPictureInputtime() {
        return pictureInputtime;
    }

    public void setPictureInputtime(Date pictureInputtime) {
        this.pictureInputtime = pictureInputtime;
    }

    public Date getPictureDeletetime() {
        return pictureDeletetime;
    }

    public void setPictureDeletetime(Date pictureDeletetime) {
        this.pictureDeletetime = pictureDeletetime;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName == null ? null : pictureName.trim();
    }

    public String getPictureOwner() {
        return pictureOwner;
    }

    public void setPictureOwner(String pictureOwner) {
        this.pictureOwner = pictureOwner == null ? null : pictureOwner.trim();
    }

    public Integer getPictureType() {
        return pictureType;
    }

    public void setPictureType(Integer pictureType) {
        this.pictureType = pictureType;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath == null ? null : picturePath.trim();
    }
}