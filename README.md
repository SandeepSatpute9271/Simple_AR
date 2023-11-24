# Simple_AR
Using Scene Viewer with intents directly from your Android native app

Launched Scene Viewer Using an Explicit Intent

Uri.parse("https://arvr.google.com/scene-viewer/1.0").buildUpon()
                    .appendQueryParameter("**file**", "") 
                    .appendQueryParameter("mode", "ar_only")
                    .appendQueryParameter("title", "Tiger")
                    .build()

In Above code file(required) is a valid URL.	The glTF or glb file that should be loaded into Scene Viewer is specified by this URL. It has to be URL-escaped.
