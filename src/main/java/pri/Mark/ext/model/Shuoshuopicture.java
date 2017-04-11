package pri.Mark.ext.model;

public class Shuoshuopicture {
    private Integer shuoshuopictureId;

    private String shuoshuopictureName;

    private Integer shuoshuopictureShuoshuo;

    private String shuoshuopicturePath;

    public Integer getShuoshuopictureId() {
        return shuoshuopictureId;
    }

    public void setShuoshuopictureId(Integer shuoshuopictureId) {
        this.shuoshuopictureId = shuoshuopictureId;
    }

    public String getShuoshuopictureName() {
        return shuoshuopictureName;
    }

    public void setShuoshuopictureName(String shuoshuopictureName) {
        this.shuoshuopictureName = shuoshuopictureName == null ? null : shuoshuopictureName.trim();
    }

    public Integer getShuoshuopictureShuoshuo() {
        return shuoshuopictureShuoshuo;
    }

    public void setShuoshuopictureShuoshuo(Integer shuoshuopictureShuoshuo) {
        this.shuoshuopictureShuoshuo = shuoshuopictureShuoshuo;
    }

    public String getShuoshuopicturePath() {
        return shuoshuopicturePath;
    }

    public void setShuoshuopicturePath(String shuoshuopicturePath) {
        this.shuoshuopicturePath = shuoshuopicturePath == null ? null : shuoshuopicturePath.trim();
    }
}