package com.redhat.demos.cwtbookingdemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class TravelBooking implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "TRAVELBOOKING_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "TRAVELBOOKING_ID_GENERATOR", sequenceName = "TRAVELBOOKING_ID_SEQ")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label(value = "Booking Identifier")
   private java.lang.String bookingID;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL })
   @org.kie.api.definition.type.Label(value = "Booking Traveler Profile")
   private com.redhat.demos.cwtbookingdemo.TravelerProfile bookingTraveler;

   @javax.persistence.OneToMany(cascade = { javax.persistence.CascadeType.ALL })
   @org.kie.api.definition.type.Label(value = "Booking Travel Segments")
   private java.util.List<com.redhat.demos.cwtbookingdemo.TravelSegment> bookingSegments;

   @org.kie.api.definition.type.Label(value = "Booking Validated")
   private java.lang.Boolean bookingValidated;

   @org.kie.api.definition.type.Label(value = "Booking Priced")
   private boolean bookingPriced;

   @org.kie.api.definition.type.Label(value = "Booking Complete/Confirmed")
   private boolean bookingConfirmed;

   public TravelBooking()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getBookingID()
   {
      return this.bookingID;
   }

   public void setBookingID(java.lang.String bookingID)
   {
      this.bookingID = bookingID;
   }

   public com.redhat.demos.cwtbookingdemo.TravelerProfile getBookingTraveler()
   {
      return this.bookingTraveler;
   }

   public void setBookingTraveler(
         com.redhat.demos.cwtbookingdemo.TravelerProfile bookingTraveler)
   {
      this.bookingTraveler = bookingTraveler;
   }

   public java.util.List<com.redhat.demos.cwtbookingdemo.TravelSegment> getBookingSegments()
   {
      return this.bookingSegments;
   }

   public void setBookingSegments(
         java.util.List<com.redhat.demos.cwtbookingdemo.TravelSegment> bookingSegments)
   {
      this.bookingSegments = bookingSegments;
   }

   public java.lang.Boolean getBookingValidated()
   {
      return this.bookingValidated;
   }

   public void setBookingValidated(java.lang.Boolean bookingValidated)
   {
      this.bookingValidated = bookingValidated;
   }

   public boolean isBookingPriced()
   {
      return this.bookingPriced;
   }

   public void setBookingPriced(boolean bookingPriced)
   {
      this.bookingPriced = bookingPriced;
   }

   public boolean isBookingConfirmed()
   {
      return this.bookingConfirmed;
   }

   public void setBookingConfirmed(boolean bookingConfirmed)
   {
      this.bookingConfirmed = bookingConfirmed;
   }

   public TravelBooking(
         java.lang.Long id,
         java.lang.String bookingID,
         com.redhat.demos.cwtbookingdemo.TravelerProfile bookingTraveler,
         java.util.List<com.redhat.demos.cwtbookingdemo.TravelSegment> bookingSegments,
         java.lang.Boolean bookingValidated, boolean bookingPriced,
         boolean bookingConfirmed)
   {
      this.id = id;
      this.bookingID = bookingID;
      this.bookingTraveler = bookingTraveler;
      this.bookingSegments = bookingSegments;
      this.bookingValidated = bookingValidated;
      this.bookingPriced = bookingPriced;
      this.bookingConfirmed = bookingConfirmed;
   }

}