package com.atlassian.imageapp.model;

import com.google.gson.annotations.SerializedName;

public class Image {

    private final String id;
    private final String title;
    private final String description;
    private final long datetime;
    private final String type;
    private final boolean animated;
    private final long width;
    private final long height;
    private final long size;
    private final long views;
    private final long bandwidth;
    private final String deletehash;
    private final String link;
    private final String gifv;
    private final String mp4;
    @SerializedName("mp4_size") private final long mp4Size;
    private final boolean looping;
    private final String vote;
    private final boolean favorite;
    private final boolean nsfw;
    @SerializedName("comment_count") private final int commentCount;
    private final String topic;
    @SerializedName("topic_id") private final long topicId;
    private final String section;
    @SerializedName("account_url") private final String accountUrl;
    @SerializedName("account_id") private final long accountId;
    private final long ups;
    private final long downs;
    private final long points;
    private final long score;
    @SerializedName("is_album") private final boolean isAlbum;


    public Image(String id, String title, String description, long datetime, String type,
                 boolean animated, long width, long height, long size, long views, long bandwidth,
                 String deletehash, String link, String gifv, String mp4, long mp4Size,
                 boolean looping, String vote, boolean favorite, boolean nsfw, int commentCount,
                 String topic, long topicId, String section, String accountUrl, long accountId,
                 long ups, long downs, long points, long score, boolean isAlbum) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.datetime = datetime;
        this.type = type;
        this.animated = animated;
        this.width = width;
        this.height = height;
        this.size = size;
        this.views = views;
        this.bandwidth = bandwidth;
        this.deletehash = deletehash;
        this.link = link;
        this.gifv = gifv;
        this.mp4 = mp4;
        this.mp4Size = mp4Size;
        this.looping = looping;
        this.vote = vote;
        this.favorite = favorite;
        this.nsfw = nsfw;
        this.commentCount = commentCount;
        this.topic = topic;
        this.topicId = topicId;
        this.section = section;
        this.accountUrl = accountUrl;
        this.accountId = accountId;
        this.ups = ups;
        this.downs = downs;
        this.points = points;
        this.score = score;
        this.isAlbum = isAlbum;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public long getDatetime() {
        return datetime;
    }

    public String getType() {
        return type;
    }

    public boolean isAnimated() {
        return animated;
    }

    public long getWidth() {
        return width;
    }

    public long getHeight() {
        return height;
    }

    public long getSize() {
        return size;
    }

    public long getViews() {
        return views;
    }

    public long getBandwidth() {
        return bandwidth;
    }

    public String getDeletehash() {
        return deletehash;
    }

    public String getLink() {
        return link;
    }

    public String getGifv() {
        return gifv;
    }

    public String getMp4() {
        return mp4;
    }

    public long getMp4Size() {
        return mp4Size;
    }

    public boolean isLooping() {
        return looping;
    }

    public String getVote() {
        return vote;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public boolean isNsfw() {
        return nsfw;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public String getTopic() {
        return topic;
    }

    public long getTopicId() {
        return topicId;
    }

    public String getSection() {
        return section;
    }

    public String getAccountUrl() {
        return accountUrl;
    }

    public long getAccountId() {
        return accountId;
    }

    public long getUps() {
        return ups;
    }

    public long getDowns() {
        return downs;
    }

    public long getPoints() {
        return points;
    }

    public long getScore() {
        return score;
    }

    public boolean isAlbum() {
        return isAlbum;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Image image = (Image) o;

        if (datetime != image.datetime) {
            return false;
        }
        if (animated != image.animated) {
            return false;
        }
        if (width != image.width) {
            return false;
        }
        if (height != image.height) {
            return false;
        }
        if (size != image.size) {
            return false;
        }
        if (views != image.views) {
            return false;
        }
        if (bandwidth != image.bandwidth) {
            return false;
        }
        if (mp4Size != image.mp4Size) {
            return false;
        }
        if (looping != image.looping) {
            return false;
        }
        if (favorite != image.favorite) {
            return false;
        }
        if (nsfw != image.nsfw) {
            return false;
        }
        if (commentCount != image.commentCount) {
            return false;
        }
        if (topicId != image.topicId) {
            return false;
        }
        if (accountId != image.accountId) {
            return false;
        }
        if (ups != image.ups) {
            return false;
        }
        if (downs != image.downs) {
            return false;
        }
        if (points != image.points) {
            return false;
        }
        if (score != image.score) {
            return false;
        }
        if (isAlbum != image.isAlbum) {
            return false;
        }
        if (id != null ? !id.equals(image.id) : image.id != null) {
            return false;
        }
        if (title != null ? !title.equals(image.title) : image.title != null) {
            return false;
        }
        if (description != null ? !description.equals(image.description) : image.description != null) {
            return false;
        }
        if (type != null ? !type.equals(image.type) : image.type != null) {
            return false;
        }
        if (deletehash != null ? !deletehash.equals(image.deletehash) : image.deletehash != null) {
            return false;
        }
        if (link != null ? !link.equals(image.link) : image.link != null) {
            return false;
        }
        if (gifv != null ? !gifv.equals(image.gifv) : image.gifv != null) {
            return false;
        }
        if (mp4 != null ? !mp4.equals(image.mp4) : image.mp4 != null) {
            return false;
        }
        if (vote != null ? !vote.equals(image.vote) : image.vote != null) {
            return false;
        }
        if (topic != null ? !topic.equals(image.topic) : image.topic != null) {
            return false;
        }
        if (section != null ? !section.equals(image.section) : image.section != null) {
            return false;
        }
        return accountUrl != null ? accountUrl.equals(image.accountUrl) : image.accountUrl == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) (datetime ^ (datetime >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (animated ? 1 : 0);
        result = 31 * result + (int) (width ^ (width >>> 32));
        result = 31 * result + (int) (height ^ (height >>> 32));
        result = 31 * result + (int) (size ^ (size >>> 32));
        result = 31 * result + (int) (views ^ (views >>> 32));
        result = 31 * result + (int) (bandwidth ^ (bandwidth >>> 32));
        result = 31 * result + (deletehash != null ? deletehash.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (gifv != null ? gifv.hashCode() : 0);
        result = 31 * result + (mp4 != null ? mp4.hashCode() : 0);
        result = 31 * result + (int) (mp4Size ^ (mp4Size >>> 32));
        result = 31 * result + (looping ? 1 : 0);
        result = 31 * result + (vote != null ? vote.hashCode() : 0);
        result = 31 * result + (favorite ? 1 : 0);
        result = 31 * result + (nsfw ? 1 : 0);
        result = 31 * result + commentCount;
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        result = 31 * result + (int) (topicId ^ (topicId >>> 32));
        result = 31 * result + (section != null ? section.hashCode() : 0);
        result = 31 * result + (accountUrl != null ? accountUrl.hashCode() : 0);
        result = 31 * result + (int) (accountId ^ (accountId >>> 32));
        result = 31 * result + (int) (ups ^ (ups >>> 32));
        result = 31 * result + (int) (downs ^ (downs >>> 32));
        result = 31 * result + (int) (points ^ (points >>> 32));
        result = 31 * result + (int) (score ^ (score >>> 32));
        result = 31 * result + (isAlbum ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", datetime=" + datetime +
                ", type='" + type + '\'' +
                ", animated=" + animated +
                ", width=" + width +
                ", height=" + height +
                ", size=" + size +
                ", views=" + views +
                ", bandwidth=" + bandwidth +
                ", deletehash='" + deletehash + '\'' +
                ", link='" + link + '\'' +
                ", gifv='" + gifv + '\'' +
                ", mp4='" + mp4 + '\'' +
                ", mp4Size=" + mp4Size +
                ", looping=" + looping +
                ", vote='" + vote + '\'' +
                ", favorite=" + favorite +
                ", nsfw=" + nsfw +
                ", commentCount=" + commentCount +
                ", topic='" + topic + '\'' +
                ", topicId=" + topicId +
                ", section='" + section + '\'' +
                ", accountUrl='" + accountUrl + '\'' +
                ", accountId=" + accountId +
                ", ups=" + ups +
                ", downs=" + downs +
                ", points=" + points +
                ", score=" + score +
                ", isAlbum=" + isAlbum +
                '}';
    }
}
