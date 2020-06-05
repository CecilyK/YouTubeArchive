This project uses the Youtube API to search for a youtube channel and display the 
total number of videos,total number of subscribers,total number of views 
and the date in which the first video was published.
It also allows you to play the videos and see how long ago the video was published.
It is currently static because I have used just one channel as an example but one is able to 
search for a video in that channel and play videos in the app.
It also displays the playlists in that channel.
In the app, I have used a channel example David Dobrik. It displays all his videos ordered by 
the number of views from most viewed to least viewed. In the Home Fragment, it displays all
his videos. In the Search Fragment, it enables you to search for a video in his channel.
In the Playlists  Channel, it displays all the Playlists in his channel and in the Profile 
Fragment, it displays all his channel data.
To test, just change the channel id in the network.YoutubeAPI file to the channel id you need.
Tools:YouTube API-to get data from the API
      Retrofit-enables retrieval of the data from the API
      Material UI-for the UI design
      Shimmer Effect-a loading indicator for an easy view on the loading videos
      Fragments-for multiple screens in one activity
      Picasso library-for image processing in the app
      RecyclerView-to display the list of videos
      Endless scrolling-using the adapterview and recyclerview
      Postman-to test the API