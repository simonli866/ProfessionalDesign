package com.chineseivy.bean;

import java.util.Date;

public class Favourite extends FavouriteKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_favourite.addFavouriteTime
     *
     * @mbg.generated
     */
    private Date addfavouritetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_favourite.addFavouriteTime
     *
     * @return the value of t_favourite.addFavouriteTime
     *
     * @mbg.generated
     */
    public Date getAddfavouritetime() {
        return addfavouritetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_favourite.addFavouriteTime
     *
     * @param addfavouritetime the value for t_favourite.addFavouriteTime
     *
     * @mbg.generated
     */
    public void setAddfavouritetime(Date addfavouritetime) {
        this.addfavouritetime = addfavouritetime;
    }
}