package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;


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


    public RestaurantModel saveRestaurant() {


        OfferModel offer1 = OfferModel.builder()
                .offerTitle("3aaaard el komboooo")
                .offerDescription("%od talata we 5oood wa7ed kman")
                .offerStart(Timestamp.from(Instant.now()))
                .offerEnd(Timestamp.from(Instant.now()))
                .offerImages(List.of("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank"))
                .build();

        OfferModel offer2 = OfferModel.builder()
                .offerTitle("3aaaard el komboooo")
                .offerDescription("%od talata we 5oood wa7ed kman")
                .offerStart(Timestamp.from(Instant.now()))
                .offerEnd(Timestamp.from(Instant.now()))
                .offerImages(List.of("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank"))

                .build();
        OfferModel offer3 = OfferModel.builder()
                .offerTitle("3aaaard el komboooo")
                .offerDescription("5od talata we 5oood wa7ed kman")
                .offerStart(Timestamp.from(Instant.now()))
                .offerEnd(Timestamp.from(Instant.now()))
                .offerImages(List.of("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank"))
                .build();

        ServicesModel service1 = ServicesModel.builder()
                .serviceName("Wifi")
                .serviceLogo("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .build();


        ServicesModel service2 = ServicesModel.builder()
                .serviceName("Open-Air")
                .serviceLogo("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .build();
        ServicesModel service3 = ServicesModel.builder()
                .serviceName("Playstation")
                .serviceLogo("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .build();
        ServicesModel service4 = ServicesModel.builder()
                .serviceName("Massage")
                .serviceLogo("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .build();
        ServicesModel service5 = ServicesModel.builder()
                .serviceName("Spa")
                .serviceLogo("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .build();

        BranchModel branch1 = BranchModel.builder()
                .branchPhone(List.of("123456789", "1122334455", "99887766554"))
                .branchLocation("new cairo")
                .branchStatus(true)
                .branchAddress("new giza")
                .services(List.of(service1, service2, service3, service4, service5))
                .offers(List.of(offer1, offer2, offer3))
                .build();
        BranchModel branch2 = BranchModel.builder()
                .branchPhone(List.of("3578951", "1598753", "456987"))
                .branchLocation("new giza")
                .branchAddress("new giza")
                .branchStatus(true)
                .services(List.of(service2, service3, service5))
                .offers(List.of(offer1))
                .build();
        BranchModel branch3 = BranchModel.builder()
                .branchPhone(List.of("258963", "456987", "13365444"))
                .branchLocation("new october")
                .branchAddress("new giza")
                .branchStatus(true)
                .services(List.of(service1, service3, service4))
                .offers(List.of(offer1, offer3))
                .build();

        NewsModel new1 = NewsModel.builder()
                .newTittle("5asm 50% 3la el kebda el kelaby ")
                .newDescription("5ooood wa7d kebda taaaaa5od wa7ed tany 3aleeeeh")
                .newImages(List.of("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank"))

                .newDate(Timestamp.from(Instant.now()))
                .build();
        NewsModel new2 = NewsModel.builder()
                .newTittle("5asm 50% 3la el kebda el kelaby ")
                .newDescription("5ooood wa7d kebda taaaaa5od wa7ed tany 3aleeeeh")
                .newImages(List.of("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank"))

                .newDate(Timestamp.from(Instant.now()))
                .build();
        NewsModel new3 = NewsModel.builder()
                .newTittle("5asm 50% 3la el kebda el kelaby ")
                .newDescription("5ooood wa7d kebda taaaaa5od wa7ed tany 3aleeeeh")
                .newImages(List.of("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank"))
                .newDate(Timestamp.from(Instant.now()))
                .build();


        CategoryModel category = CategoryModel.builder()
                .categoryName("Akl sory")
                .categoryLogo("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .build();
        CategoryModel category1 = CategoryModel.builder()
                .categoryName("Akl Masry")
                .categoryLogo("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .build();
        CategoryModel category2 = CategoryModel.builder()
                .categoryName("Akl italy")
                .categoryLogo("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .build();
        CategoryModel category3 = CategoryModel.builder()
                .categoryName("Akl saudi")
                .categoryLogo("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .build();

        RestaurantModel restaurant = RestaurantModel.builder()
                .restaurantName("7oda talawth")
                .restaurantClosingTime( LocalTime.now())
                .restaurantOpeningTime(  LocalTime.now())
                .restaurantHotline("15988")
                .restaurantDescription("Agmed kebda fe masr")
                .restaurantViewers(5000)
                .restaurantCoverImage("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .restaurantLogoImage("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank")
                .branches(List.of(branch1, branch2, branch3))
                .news(List.of(new1, new2, new3))
                .restaurantImages(List.of("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank"))
                .restaurantMenuImages(List.of("https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank", "https://stackoverflow.com/questions/26860418/bean-validation-collection-of-string-not-blank"))
                .categories(List.of(category, category1, category2, category3))
//                .users(users)
                .build();
        restaurantRepository.save(restaurant);
        return restaurant;
    }

    @Test
    public void SaveAllData() {
        RestaurantModel restaurant = saveRestaurant();
        Set<UserModel> userModel = saveUsers(Set.of(restaurant));
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

    public Set<UserModel> saveUsers(Set<RestaurantModel> restaurantModels) {
        UserModel user = UserModel.builder()
                .restaurants(restaurantModels)
                .build();
        UserModel user1 = UserModel.builder().build();
        UserModel user2 = UserModel.builder().build();
        UserModel user3 = UserModel.builder().build();
        userModelRepository.saveAll(List.of(user,user1,user2,user3));
        return Set.of(user,user1,user2,user3);
    }

    public ReviewModel saveReview(RestaurantModel restaurantModel, Set<UserModel> userModel) {
        ReviewModel review = ReviewModel.builder()
                .restaurant(restaurantModel)
                .reviewRate(4)
                .reviewDate(Timestamp.from(Instant.now()))
                .reviewComment("Elragel da mya mya we kebda de zy el fooool")
                .user(userModel.stream().toList().get(0))
//                .user(userModel.get(0))
                .build();
        reviewModelRepository.save(review);
        return review;
    }
@Test
    public void getRestaurant() {
        int x = 1;
        long k = 1;
        Long obj = k;
        List<RestaurantModel> restaurantModel = restaurantRepository.findAll();
        System.out.println(restaurantModel);
    }
}