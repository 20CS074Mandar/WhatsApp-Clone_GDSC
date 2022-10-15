package com.example.whatsapp_clone_gdsc

data class Chat(
    val id: Int,
    val name: Int,
    val time: String,
    val date: String?,
    val lastMessage: String?,
    val imageUrl: String
)

data class Call(
    val id: Int,
    val name: Int,
    val date: String,
    val imageUrl: String,
    val isMissCall: Boolean,
    val isIncoming: Boolean,
)

data class Message(
    val message: String,
    val isPeer: Boolean
)

object DummyData {
    val listChat = listOf(
        Chat(
            id = 0,
            name = R.string.Pankaj,
            time = "08:46",
            date = "17 june",
            lastMessage = "Okay Confirm Sir.",
            imageUrl = "https://timesofindia.indiatimes.com/thumb/msid-64529565,width-1200,height-900,resizemode-4/.jpg"
        ),
        Chat(
            id = 1,
            name = R.string.Hritik,
            time = "12:45",
            date = null,
            lastMessage = "Sure take care Hrits.",
            imageUrl = "https://odishanewsinsight.com/wp-content/uploads/2016/01/Hritik-Roshan.jpg"
        ),
        Chat(
            id = 2,
            name = R.string.Brad,
            time = "Yesterday",
            date = "17 june",
            lastMessage = "Cool see u there :).",
            imageUrl = "https://media1.popsugar-assets.com/files/thumbor/5e2V56jteeB_Cf97ZF8zRZ8Hftc/fit-in/728xorig/filters:format_auto-!!-:strip_icc-!!-/2019/08/01/764/n/1922398/22797bd782bbfb14_GettyImages-1165221307/i/Hot-Brad-Pitt-Pictures-2019.jpg"
        ),
        Chat(
            id = 3,
            name = R.string.DishsP,
            time = "23:56",
            date = "17 june",
            lastMessage = "There are many variations of passages of Lorem Ipsum available",
            imageUrl = "https://images.hindustantimes.com/img/2022/06/12/1600x900/WhatsApp_Image_2021-06-18_at_1.28.03_PM_(3)_1624202772291_1655053847920.jpeg"
        ),
        Chat(
            id = 4,
            name = R.string.Ana,
            time = "10/06/2021",
            date = "17 june",
            lastMessage = "Hi gorgeous.",
            imageUrl = "https://media.vogue.fr/photos/62b591fa8a4275dbe4097b25/2:3/w_2560%2Cc_limit/1240769828"
        ),
        Chat(
            id = 5,
            name = R.string.RDJ,
            time = "Yesterday",
            date = "17 june",
            lastMessage = "I know you are Iron Man",
            imageUrl = "https://www.pinkvilla.com/imageresize/robert_downey_jr.jpg?width=752&t=pvorg"
        ),
        Chat(
            id = 6,
            name = R.string.Kiara,
            time = "09/06/2021",
            date = "17 june",
            lastMessage = "Kiara can a I get a discount o Myntra?",
            imageUrl = "https://www.pinkvilla.com/imageresize/kiara_advani_on_marriage_main_1.jpg?width=752&t=pvorg"
        ),
        Chat(
            id = 7,
            name = R.string.Emaa,
            time = "08:46",
            date = "17 june",
            lastMessage = "You were in Harry Potter right?",
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/7/7f/Emma_Watson_2013.jpg"
        ),
        Chat(
            id = 8,
            name = R.string.tomH,
            time = "08:46",
            date = "17 june",
            lastMessage = "Hi VEnom",
            imageUrl = "https://flxt.tmsimg.com/assets/269411_v9_bd.jpg"
        ),
    )

    val listCall = listOf(
        Call(
            id = 0,
            name = R.string.Pankaj,
            date = "17 june 08.46",
            imageUrl = "https://timesofindia.indiatimes.com/thumb/msid-64529565,width-1200,height-900,resizemode-4/.jpg",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 1,
            name = R.string.Brad,
            date = "17 june 07.00",
            imageUrl = "https://media1.popsugar-assets.com/files/thumbor/5e2V56jteeB_Cf97ZF8zRZ8Hftc/fit-in/728xorig/filters:format_auto-!!-:strip_icc-!!-/2019/08/01/764/n/1922398/22797bd782bbfb14_GettyImages-1165221307/i/Hot-Brad-Pitt-Pictures-2019.jpg",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 3,
            name = R.string.Kiara,
            date = "15 june 05.09",
            imageUrl = "https://www.pinkvilla.com/imageresize/kiara_advani_on_marriage_main_1.jpg?width=752&t=pvorg",
            isIncoming = true,
            isMissCall = true
        ),
    )

    val listMessage = listOf(
        Message("Hi Roy how are you ?", false),
        Message("Iam fine, how are you ?", true),
        Message("Iam fine too", false),
        Message("What do you do now ?", true),
        Message("Write a book, and doing my work", false),
        Message("Wow, its so good man", true),
        Message("Yeah", false),
    )
}