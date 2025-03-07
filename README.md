# personal-narrative-project
# Unit 5 - Personal Narrative

## Introduction

Images are often used to portray our personal experiences and interests. We also use image filters and effects to change or enhance the mood of an image. When combined into collages and presentations, these images tell a story about who we are and what is important to us. Your goal is to create a personal narrative using The Theater that consists of images of your personal experiences and/or interests, incorporates data related to these experiences and/or interests that can be organized in a 2D array, and uses image filters and effects to change or enhance the mood of your images.

## Requirements

Use your knowledge of object-oriented programming, two-dimensional (2D) arrays, and algorithms to create your personal narrative collage or animation:

- **Create at least two 2D arrays** – Create at least two 2D arrays to store the data that will make up your visualization.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and two-way or multi-selection statements with compound Boolean expressions to analyze the data.
- **Use Image Filters** - Include multiple image filters learned from this unit, and additionally create new ones of your own.
- **Use methods in the String class** – Use one or more methods in the String class in your program, such as to determine whether the name of an image file contains specific characters.
- **Create a visualization** – Create an image or animation that conveys the story of the data by illustrating the patterns or relationships in the data.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README.

![UML Diagram for my project](image-1.png)

## Video

Record a short video of your story to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown

[![Project Screen Recording](nameOfThumbnail.png)](https://drive.google.com/file/d/1jgZ4eEJ0DbAu-9SbJULzfOzmVBjqYmxE/view?usp=sharing)

## Story Description

Write a description of the story that your animation showcases. Give addional context for your story here in the case your animation is more abstract and only has images and little text. Lastly, include what data in your project is represented in 2D arrays and how those directly relate to the story your animation showcase.

This is a story of all the cooking work I have done over the past few months. Strings of image files, food names, food reviews, and sound files for the project are stored in the 2D arrays. This allows for these elements to be called based on row and column.
## Image Filter Analysis

Choose at least 2 filters uses in your animation to explain how the pixels are modified. If you created a new image filter that was not one of the ones from this unit, make sure to explain and analyze that filter(s) before choosing ones that came from this unit.

The colorShift method traverses through row-major and brightens the pixels of the image. When calling the method, the user can choose a value between 0 and 255 to choose the intensity of the color shift. The applyBlur also traverses through in row-major order and blurs each pixel of the image. Each of the colors calculated the color average to produce these results. The threshold method traverses the pixels in row-major order. Thsi method extracts the colors and makes the image black and white. The applySepia method traverses the pixels of the image is row-major order. It changes the values of the colors (red, green, and blue) to apply the sepia affect to the images.