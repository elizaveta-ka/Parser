package com.example.parseproject.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
public class ParserController {

    @GetMapping("/api/hello")
    public String getHelloText() {

        return "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"title\": \"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops\",\n" +
                "    \"category\": \"clothing\",\n" +
                "    \"price\": 109.95,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"men's clothing\",\n" +
                "      \"material\": \"wool\",\n" +
                "      \"size\": 48\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 3.9,\n" +
                "        \"count\": 120\n" +
                "      },\n" +
                "      \"color\": \"yellow\",\n" +
                "      \"country\": \"Bangladesh\"\n" +
                "    },\n" +
                "    \"description\": \"Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday\",\n" +
                "    \"image\": \"https://most-beauty.ru/wp-content/uploads/2018/11/CHernaya-dozhdevaya-lyagushka.jpg\"\n" +
                "  },\n" +
                "\n" +
                "\n" +
                "  {\n" +
                "    \"id\": 2,\n" +
                "    \"title\": \"Mens Casual Premium Slim Fit T-Shirts \",\n" +
                "    \"category\": \"clothing\",\n" +
                "    \"price\": 22.3,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"men's clothing\",\n" +
                "      \"material\": \"cotton\",\n" +
                "      \"size\": 48\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 4.1,\n" +
                "        \"count\": 259\n" +
                "      },\n" +
                "      \"color\": \"red\",\n" +
                "      \"country\": \"Bangladesh\"\n" +
                "    },\n" +
                "    \"description\": \"Slim-fitting style, contrast raglan long sleeve, three-button henley placket, light weight & soft fabric for breathable and comfortable wearing. And Solid stitched shirts with round neck made for durability and a great fit for casual fashion wear and diehard baseball fans. The Henley style round neckline includes a three-button placket.\",\n" +
                "    \"image\": \"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmJb853bRd862LOkKwHEh5GNkdZGzn3_OAan2LU9MrgCSLlQJPfg7c1kNpxhYRfYC_iak&usqp=CAU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 3,\n" +
                "    \"title\": \"Mens Cotton Jacket\",\n" +
                "    \"category\": \"clothing\",\n" +
                "    \"price\": 55.99,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"men's clothing\",\n" +
                "      \"material\": \"cotton\",\n" +
                "      \"size\": 34\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 4.7,\n" +
                "        \"count\": 500\n" +
                "      },\n" +
                "      \"color\": \"red\",\n" +
                "      \"country\": \"Bangladesh\",\n" +
                "      \"style\": \"casual\"\n" +
                "    },\n" +
                "    \"description\": \"great outerwear jackets for Spring/Autumn/Winter, suitable for many occasions, such as working, hiking, camping, mountain/rock climbing, cycling, traveling or other outdoors. Good gift choice for you or your family member. A warm hearted love to Father, husband or son in this thanksgiving or Christmas Day.\",\n" +
                "    \"image\": \"https://cameralabs.org/media/k2/items/cache/d2a75979e57f1911dede05063d4a68cb_L.jpg\"\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"id\": 4,\n" +
                "    \"title\": \"Kids Casual Slim Fit\",\n" +
                "    \"category\": \"clothing\",\n" +
                "    \"price\": 15.99,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"kid's clothing\",\n" +
                "      \"material\": \"cotton\",\n" +
                "      \"size\": 28\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 2.1,\n" +
                "        \"count\": 430\n" +
                "      },\n" +
                "      \"color\": \"red\",\n" +
                "      \"country\": \"Bangladesh\",\n" +
                "      \"style\": \"casual\"\n" +
                "    },\n" +
                "    \"description\": \"The color could be slightly different between on the screen and in practice. / Please note that body builds vary by person, therefore, detailed size information should be reviewed below on the product description.\",\n" +
                "    \"image\": \"https://cameralabs.org/media/lab15/post/06-15/01/lyagushki-i-zhaby-foto_14.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 5,\n" +
                "    \"title\": \"John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet\",\n" +
                "    \"category\": \"jewelery\",\n" +
                "    \"price\": 695,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"women's jewelery\",\n" +
                "      \"material\": \"gold\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 4.6,\n" +
                "        \"count\": 400\n" +
                "      },\n" +
                "      \"country\": \"Italy\",\n" +
                "      \"gold content\": 999\n" +
                "    },\n" +
                "    \"description\": \"From our Legends Collection, the Naga was inspired by the mythical water dragon that protects the ocean's pearl. Wear facing inward to be bestowed with love and abundance, or outward for protection.\",\n" +
                "    \"image\": \"https://damion.club/uploads/posts/2022-01/thumbs/1642907549_20-damion-club-p-milaya-zhaba-20.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 6,\n" +
                "    \"title\": \"Solid Gold Petite Micropave \",\n" +
                "    \"category\": \"jewelery\",\n" +
                "    \"price\": 168,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"men's jewelery\",\n" +
                "      \"material\": \"silver\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 3.9,\n" +
                "        \"count\": 70\n" +
                "      },\n" +
                "      \"country\": \"Russia\",\n" +
                "      \"silver content\": 999\n" +
                "    },\n" +
                "    \"description\": \"Satisfaction Guaranteed. Return or exchange any order within 30 days.Designed and sold by Hafeez Center in the United States. Satisfaction Guaranteed. Return or exchange any order within 30 days.\",\n" +
                "    \"image\": \"https://cs10.pikabu.ru/images/big_size_comm/2018-03_6/1522330625192963309.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 7,\n" +
                "    \"title\": \"White Gold Plated Princess\",\n" +
                "    \"category\": \"jewelery\",\n" +
                "    \"price\": 9.99,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"men's jewelery\",\n" +
                "      \"material\": \"silver\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 3,\n" +
                "        \"count\": 400\n" +
                "      },\n" +
                "      \"country\": \"China\",\n" +
                "      \"silver content\": 550\n" +
                "    },\n" +
                "    \"description\": \"Classic Created Wedding Engagement Solitaire Diamond Promise Ring for Her. Gifts to spoil your love more for Engagement, Wedding, Anniversary, Valentine's Day...\",\n" +
                "    \"image\": \"https://bugaga.ru/uploads/posts/2019-11/1573663402_uzkorot-16.jpg\"\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"id\": 9,\n" +
                "    \"title\": \"WD 2TB Elements Portable External Hard Drive - USB 3.0 \",\n" +
                "    \"category\": \"electronics\",\n" +
                "    \"price\": 64,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"hard drives\",\n" +
                "      \"memory\": \"1 Tb\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 3.3,\n" +
                "        \"count\": 203\n" +
                "      },\n" +
                "      \"producer\": \"Seagate\",\n" +
                "      \"color\": \"black\"\n" +
                "    },\n" +
                "    \"description\": \"USB 3.0 and USB 2.0 Compatibility Fast data transfers Improve PC Performance High Capacity; Compatibility Formatted NTFS for Windows 10, Windows 8.1, Windows 7; Reformatting may be required for other operating systems; Compatibility may vary depending on user’s hardware configuration and operating system\",\n" +
                "    \"image\": \"https://fakestoreapi.com/img/61IBBVJvSDL._AC_SY879_.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 10,\n" +
                "    \"title\": \"SanDisk SSD PLUS 1TB Internal SSD - SATA III 6 Gb/s\",\n" +
                "    \"category\": \"electronics\",\n" +
                "    \"price\": 109,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"hard drives\",\n" +
                "      \"memory\": \"1 Tb\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 2.9,\n" +
                "        \"count\": 470\n" +
                "      },\n" +
                "      \"producer\": \"WD\",\n" +
                "      \"color\": \"white\"\n" +
                "    },\n" +
                "    \"description\": \"Easy upgrade for faster boot up, shutdown, application load and response (As compared to 5400 RPM SATA 2.5” hard drive; Based on published specifications and internal benchmarking tests using PCMark vantage scores) Boosts burst write performance, making it ideal for typical PC workloads The perfect balance of performance and reliability Read/write speeds of up to 535MB/s/450MB/s (Based on internal testing; Performance may vary depending upon drive capacity, host device, OS and application.)\",\n" +
                "    \"image\": \"https://fakestoreapi.com/img/61U7T1koQqL._AC_SX679_.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 11,\n" +
                "    \"title\": \"Silicon Power 256GB SSD 3D NAND A55 SLC Cache Performance Boost SATA III 2.5\",\n" +
                "    \"category\": \"electronics\",\n" +
                "    \"price\": 64,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"hard drives\",\n" +
                "      \"memory\": \"1 Tb\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 4.8,\n" +
                "        \"count\": 319\n" +
                "      },\n" +
                "      \"producer\": \"Seagate\",\n" +
                "      \"color\": \"black\"\n" +
                "    },\n" +
                "    \"description\": \"3D NAND flash are applied to deliver high transfer speeds Remarkable transfer speeds that enable faster bootup and improved overall system performance. The advanced SLC Cache Technology allows performance boost and longer lifespan 7mm slim design suitable for Ultrabooks and Ultra-slim notebooks. Supports TRIM command, Garbage Collection technology, RAID, and ECC (Error Checking & Correction) to provide the optimized performance and enhanced reliability.\",\n" +
                "    \"image\": \"https://fakestoreapi.com/img/71kWymZ+c+L._AC_SX679_.jpg\"\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"id\": 14,\n" +
                "    \"title\": \"Samsung 49-Inch CHG90 144Hz Curved Gaming Monitor (LC49HG90DMNXZA) – Super Ultrawide Screen QLED \",\n" +
                "    \"category\": \"electronics\",\n" +
                "    \"price\": 999.99,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"monitors\",\n" +
                "      \"size\": \"49 inch\",\n" +
                "      \"type\": \"QLED\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 2.2,\n" +
                "        \"count\": 140\n" +
                "      },\n" +
                "      \"producer\": \"Samsung\",\n" +
                "      \"color\": \"black\",\n" +
                "      \"power\": \"0.5 kWt\"\n" +
                "    },\n" +
                "    \"description\": \"49 INCH SUPER ULTRAWIDE 32:9 CURVED GAMING MONITOR with dual 27 inch screen side by side QUANTUM DOT (QLED) TECHNOLOGY, HDR support and factory calibration provides stunningly realistic and accurate color and contrast 144HZ HIGH REFRESH RATE and 1ms ultra fast response time work to eliminate motion blur, ghosting, and reduce input lag\",\n" +
                "    \"image\": \"https://fakestoreapi.com/img/81Zt42ioCgL._AC_SX679_.jpg\"\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"id\": 21,\n" +
                "    \"title\": \"R2D2\",\n" +
                "    \"category\": \"robots\",\n" +
                "    \"price\": 1500,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"assistant robots\",\n" +
                "      \"size\": \"0.7 m x 0.5 m x 0.5 m\",\n" +
                "      \"type\": \"electronic brain\",\n" +
                "      \"chip\": \"X1\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 5.0,\n" +
                "        \"count\": 99\n" +
                "      },\n" +
                "      \"producer\": \"Intel\",\n" +
                "      \"color\": \"silver\",\n" +
                "      \"power\": \"5 kWt\"\n" +
                "    },\n" +
                "    \"description\": \"Very clever robot\",\n" +
                "    \"image\": \"../../images/rd-d2.png\"\n" +
                "\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"id\": 22,\n" +
                "    \"title\": \"Bender\",\n" +
                "    \"category\": \"robots\",\n" +
                "    \"price\": 999,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"humor robots\",\n" +
                "      \"type\": \"android\",\n" +
                "      \"chip\": \"X2\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 4.5,\n" +
                "        \"count\": 25\n" +
                "      },\n" +
                "      \"producer\": \"AMD\",\n" +
                "      \"color\": \"silver\",\n" +
                "      \"power\": \"10 kWt\"\n" +
                "    },\n" +
                "    \"description\": \"With blackjack and...\",\n" +
                "    \"image\": \"../../images/img_4.png\"\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"id\": 24,\n" +
                "    \"title\": \"21-A\",\n" +
                "    \"category\": \"robots\",\n" +
                "    \"price\": 5000,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"soldier robots\",\n" +
                "      \"type\": \"android\",\n" +
                "      \"chip\": \"X10\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 5.0,\n" +
                "        \"count\": 20000\n" +
                "      },\n" +
                "      \"producer\": \"Samsung\",\n" +
                "      \"color\": \"dark grey\",\n" +
                "      \"power\": \"57 kWt\"\n" +
                "    },\n" +
                "    \"description\": \"Will help you to conquer the whole universe\",\n" +
                "    \"image\": \"../../images/img_3.jpg\"\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"id\": 25,\n" +
                "    \"title\": \"21-A type b\",\n" +
                "    \"category\": \"robots\",\n" +
                "    \"price\": 7000,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"recon robots\",\n" +
                "      \"type\": \"android\",\n" +
                "      \"chip\": \"X10\"\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 5.0,\n" +
                "        \"count\": 700\n" +
                "      },\n" +
                "      \"producer\": \"Samsung\",\n" +
                "      \"color\": \"dark grey\",\n" +
                "      \"power\": \"57 kWt\"\n" +
                "    },\n" +
                "    \"description\": \"Will help you to conquer the whole universe\",\n" +
                "    \"image\": \"../../images/img_3.jpg\"\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"id\": 26,\n" +
                "    \"title\": \"iPhone 9\",\n" +
                "    \"category\": \"electronics\",\n" +
                "    \"price\": 549,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"smartphones\",\n" +
                "      \"brand\": \"Apple\"\n" +
                "\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 4.6,\n" +
                "        \"count\": 99\n" +
                "      },\n" +
                "      \"discountPercentage\": 12.96,\n" +
                "      \"color\": \"silver\",\n" +
                "      \"power\": \"5 kWt\",\n" +
                "      \"stock\": 94\n" +
                "    },\n" +
                "    \"description\": \"An apple mobile which is nothing like apple\",\n" +
                "    \"image\": \"https://dummyjson.com/image/i/products/1/thumbnail.jpg\",\n" +
                "    \"gallery_images\": [\"https://dummyjson.com/image/i/products/1/1.jpg\",\"https://dummyjson.com/image/i/products/1/2.jpg\",\n" +
                "      \"https://dummyjson.com/image/i/products/1/3.jpg\",\"https://dummyjson.com/image/i/products/1/4.jpg\",\"https://dummyjson.com/image/i/products/1/thumbnail.jpg\"]\n" +
                "},\n" +
                "\n" +
                "  {\n" +
                "    \"id\": 27,\n" +
                "    \"title\": \"iPhone X\",\n" +
                "    \"category\": \"electronics\",\n" +
                "    \"price\": 899,\n" +
                "    \"filter_features\":\n" +
                "    {\n" +
                "      \"subCategory\": \"smartphones\",\n" +
                "      \"brand\": \"Apple\"\n" +
                "\n" +
                "    },\n" +
                "    \"non-filter_features\": {\n" +
                "      \"rating\": {\n" +
                "        \"rate\": 4.4,\n" +
                "        \"count\": 99\n" +
                "      },\n" +
                "      \"discountPercentage\": 17.94,\n" +
                "      \"color\": \"silver\",\n" +
                "      \"power\": \"5 kWt\",\n" +
                "      \"stock\": 34\n" +
                "    },\n" +
                "    \"description\": \"SIM-Free, Model A19211 6.5-inch Super Retina HD display with OLED technology A12 Bionic chip with ...\",\n" +
                "    \"image\": \"https://dummyjson.com/image/i/products/2/thumbnail.jpg\",\n" +
                "    \"gallery_images\": [\"https://dummyjson.com/image/i/products/2/1.jpg\",\"https://dummyjson.com/image/i/products/2/2.jpg\",\n" +
                "      \"https://dummyjson.com/image/i/products/2/3.jpg\",\"https://dummyjson.com/image/i/products/2/thumbnail.jpg\"]\n" +
                "  }\n" +
                "]";
    }
}
