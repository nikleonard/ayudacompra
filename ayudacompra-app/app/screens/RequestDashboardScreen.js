import "react-native-gesture-handler";
import React from "react";
import {
  StyleSheet,
  Text,
  View,
  Image,
  TouchableOpacity,
  ScrollView,
} from "react-native";
import { Card } from "react-native-elements";
import { human } from "react-native-typography";

//Arreglo información user
const users = [
  {
    name: "brynn",
    avatar: "https://s3.amazonaws.com/uifaces/faces/twitter/brynn/128.jpg",
    direccion: "Calle 123",
  },
  {
    name: "A",
    avatar: "https://s3.amazonaws.com/uifaces/faces/twitter/brynn/128.jpg",
    direccion: "Calle 123",
  },
  ,
  {
    name: "B",
    avatar: "https://s3.amazonaws.com/uifaces/faces/twitter/brynn/128.jpg",
    direccion: "Calle 123",
  },
  ,
  {
    name: "C",
    avatar: "https://s3.amazonaws.com/uifaces/faces/twitter/brynn/128.jpg",
    direccion: "Calle 123",
  },
  ,
  {
    name: "brynn",
    avatar: "https://s3.amazonaws.com/uifaces/faces/twitter/brynn/128.jpg",
    direccion: "Calle 123",
  },
  ,
  {
    name: "brynn",
    avatar: "https://s3.amazonaws.com/uifaces/faces/twitter/brynn/128.jpg",
    direccion: "Calle 123",
  },
];

const RequestDashboardScreen = ({ navigation }) => {
  return (
    <ScrollView>
      <View style={styles.container}>
        {users.map((user, i) => {
          return (
            <TouchableOpacity
              key={i}
              onPress={() => navigation.navigate("RequestDetailScreen")}
            >
              <Card style={styles.card}>
                <View style={styles.cardContainer}>
                  <Image style={styles.stretch} source={{ uri: user.avatar }} />
                  <View style={styles.textContainer}>
                    <Text style={human.headline}>{user.name}</Text>
                    <Text style={human.callout}>{user.direccion}</Text>
                  </View>
                </View>
              </Card>
            </TouchableOpacity>
          );
        })}
      </View>
    </ScrollView>
  );
};

const styles = StyleSheet.create({
  card: {
    backgroundColor: "#fff",
    justifyContent: "space-between",
  },
  cardContainer: {
    flexDirection: "row",
    margin: 5,
    justifyContent: "flex-start",
  },
  textContainer: {
    justifyContent: "center",
    marginLeft: "5%",
  },
  stretch: {
    width: 50,
    height: 50,
    resizeMode: "cover",
    borderRadius: 400 / 2,
  },
});

export default RequestDashboardScreen;
