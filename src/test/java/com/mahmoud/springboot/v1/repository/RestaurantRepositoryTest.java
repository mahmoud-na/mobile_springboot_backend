package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;


@SpringBootTest
class RestaurantRepositoryTest {

    @Autowired
    private RestaurantRepository restaurantRepository;
    @Autowired
    private PackageRepository packageRepository;
    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Autowired
    private UserModelRepository userModelRepository;
    @Autowired
    private ReviewModelRepository reviewModelRepository;


    public RestaurantModel saveRestaurant(List<UserModel> users) {


        OfferModel offer1 = OfferModel.builder()
                .offerTitle("3aaaard el komboooo")
                .offerDescription("%od talata we 5oood wa7ed kman")
                .offerStart(Timestamp.from(Instant.now()))
                .offerEnd(Timestamp.from(Instant.now()))
                .offerImages(List.of("Offer_Image 1", "Offer_Image 2", "Offer_Image 3", "Offer_Image 4"))
                .build();

        OfferModel offer2 = OfferModel.builder()
                .offerTitle("3aaaard el komboooo")
                .offerDescription("%od talata we 5oood wa7ed kman")
                .offerStart(Timestamp.from(Instant.now()))
                .offerEnd(Timestamp.from(Instant.now()))
                .offerImages(List.of("Offer_Image 1", "Offer_Image 2", "Offer_Image 3", "Offer_Image 4"))
                .build();
        OfferModel offer3 = OfferModel.builder()
                .offerTitle("3aaaard el komboooo")
                .offerDescription("5od talata we 5oood wa7ed kman")
                .offerStart(Timestamp.from(Instant.now()))
                .offerEnd(Timestamp.from(Instant.now()))
                .offerImages(List.of("Offer_Image 1", "Offer_Image 2", "Offer_Image 3", "Offer_Image 4"))
                .build();

        ServicesModel service1 = ServicesModel.builder()
                .serviceName("Wifi")
                .build();


        ServicesModel service2 = ServicesModel.builder()
                .serviceName("Open-Air")
                .build();
        ServicesModel service3 = ServicesModel.builder()
                .serviceName("Playstation")
                .build();
        ServicesModel service4 = ServicesModel.builder()
                .serviceName("Massage")
                .build();
        ServicesModel service5 = ServicesModel.builder()
                .serviceName("Spa")
                .build();

        BranchModel branch1 = BranchModel.builder()
                .branchPhone(List.of("123456789", "1122334455", "99887766554"))
                .branchLocation("new cairo")
                .branchStatus(true)
                .services(List.of(service1, service2, service3, service4, service5))
                .offers(List.of(offer1, offer2, offer3))
                .build();
        BranchModel branch2 = BranchModel.builder()
                .branchPhone(List.of("3578951", "1598753", "456987"))
                .branchLocation("new giza")
                .branchStatus(true)
                .services(List.of(service2, service3, service5))
                .offers(List.of(offer1))
                .build();
        BranchModel branch3 = BranchModel.builder()
                .branchPhone(List.of("258963", "456987", "13365444"))
                .branchLocation("new october")
                .branchStatus(true)
                .services(List.of(service1, service3, service4))
                .offers(List.of(offer1, offer3))
                .build();

        NewsModel new1 = NewsModel.builder()
                .newTittle("5asm 50% 3la el kebda el kelaby ")
                .newDescription("5ooood wa7d kebda taaaaa5od wa7ed tany 3aleeeeh")
                .newImages(List.of("new Image 1 ", "new Image 2 ", "new Image 3 "))
                .newDate(Timestamp.from(Instant.now()))
                .build();
        NewsModel new2 = NewsModel.builder()
                .newTittle("5asm 50% 3la el kebda el kelaby ")
                .newDescription("5ooood wa7d kebda taaaaa5od wa7ed tany 3aleeeeh")
                .newImages(List.of("new Image 1 ", "new Image 2 ", "new Image 3 "))
                .newDate(Timestamp.from(Instant.now()))
                .build();
        NewsModel new3 = NewsModel.builder()
                .newTittle("5asm 50% 3la el kebda el kelaby ")
                .newDescription("5ooood wa7d kebda taaaaa5od wa7ed tany 3aleeeeh")
                .newImages(List.of("new Image 1 ", "new Image 2 ", "new Image 3 "))
                .newDate(Timestamp.from(Instant.now()))
                .build();


        CategoryModel category = CategoryModel.builder()
                .CategoryName("Akl sory")
                .build();
        CategoryModel category1 = CategoryModel.builder()
                .CategoryName("Akl Masry")
                .build();
        CategoryModel category2 = CategoryModel.builder()
                .CategoryName("Akl italy")
                .build();
        CategoryModel category3 = CategoryModel.builder()
                .CategoryName("Akl saudi")
                .build();

        RestaurantModel restaurant = RestaurantModel.builder()
                .restaurantName("7oda talawth")
                .restaurantClosingTime(Timestamp.from(Instant.now()))
                .restaurantOpeningTime(Timestamp.from(Instant.now()))
                .restaurantHotline("15988")
                .restaurantDescription("Agmed kebda fe masr")
                .restaurantViewers(5000)
                .restaurantLogoImage("kjfhadkhfadkhadkh")
                .branches(List.of(branch1, branch2, branch3))
                .news(List.of(new1, new2, new3))
                .restaurantImages(List.of("Restaurant Image ===> 1", "Restaurant Image ===> 3", "Restaurant Image ===> 3"))
                .restaurantMenuImages(List.of("Restaurant Menu Image ===> 1", "Restaurant Menu Image ===> 3", "Restaurant Menu Image ===> 3"))
                .categories(List.of(category, category1, category2, category3))
                .users(users)
                .build();
        restaurantRepository.save(restaurant);
        return restaurant;
    }

    @Test
    public void SaveAllData() {
        List<UserModel> userModel = saveUsers();
        RestaurantModel restaurant = saveRestaurant(userModel);
        PackageModel packageModel = savePackage();
        SubscriptionModel subscriptionModel = restaurantSubscription(restaurant, packageModel);
        ReviewModel reviewModel = saveReview(restaurant, userModel);
    }

    public PackageModel savePackage() {
        PackageModel packageModel = PackageModel.builder()
                .packageName("premium")
                .build();

        packageRepository.save(packageModel);
        return packageModel;
    }


    public SubscriptionModel restaurantSubscription(RestaurantModel restaurantModel, PackageModel packageModel) {
        SubscriptionModel subscriptionModel = SubscriptionModel.builder()
                .subscriptionStart(Timestamp.from(Instant.now()))
                .subscriptionEnd(Timestamp.from(Instant.now()))
                .restaurant(restaurantModel)
                .packageModel(packageModel)
                .build();
        subscriptionRepository.save(subscriptionModel);
        return subscriptionModel;
    }

    public List<UserModel> saveUsers() {
        UserModel user = UserModel.builder().build();
        UserModel user1 = UserModel.builder().build();
        UserModel user2 = UserModel.builder().build();
        UserModel user3 = UserModel.builder().build();
        userModelRepository.saveAll(List.of(user,user1,user2,user3));
        return List.of(user,user1,user2,user3);
    }

    public ReviewModel saveReview(RestaurantModel restaurantModel, List<UserModel> userModel) {
        ReviewModel review = ReviewModel.builder()
                .restaurant(restaurantModel)
                .reviewRate(4)
                .reviewDate(Timestamp.from(Instant.now()))
                .reviewComment("Elragel da mya mya we kebda de zy el fooool")
                .user(userModel.get(0))
                .build();
        reviewModelRepository.save(review);
        return review;
    }

    public void getRestaurant() {
        int x = 1;
        long k = 1;
        Long obj = k;
        List<RestaurantModel> restaurantModel = restaurantRepository.findAll();
        System.out.println(restaurantModel);
    }
}