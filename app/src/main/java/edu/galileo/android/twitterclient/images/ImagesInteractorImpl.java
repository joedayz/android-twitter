package edu.galileo.android.twitterclient.images;

/**
 * Created by ykro.
 */
public class ImagesInteractorImpl implements ImagesInteractor {
    private final ImagesRepository imagesRepository;


    public ImagesInteractorImpl(ImagesRepository imagesRepository) {
        this.imagesRepository = imagesRepository;
    }

    @Override
    public void getImageItemsList() {
        this.imagesRepository.getImages();

    }
}
