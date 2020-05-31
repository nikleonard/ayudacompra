import "react-native-gesture-handler";
import React from "react";
import { View, Text, StyleSheet, Image, ScrollView } from "react-native";
import { Card, Button } from "react-native-elements";

const products = [
  {
    id: "1",
    name: "Arroz",
    quantity: "1",
  },
  {
    id: "2",
    name: "Tallarines N°3",
    quantity: "3",
  },
  {
    id: "3",
    name: "Salsa de tomates",
    quantity: "2",
  },
  {
    id: "4",
    name: "Papel Higénico",
    quantity: "1",
  },
  {
    id: "5",
    name: "Mermelada",
    quantity: "2",
  },
  {
    id: "6",
    name: "Yogurt",
    quantity: "4",
  },
  {
    id: "7",
    name: "Aliños",
    quantity: "1",
  },
  {
    id: "8",
    name: "Fideos",
    quantity: "1",
  },
  {
    id: "9",
    name: "Lentejas",
    quantity: "1",
  },
  {
    id: "10",
    name: "Porotos",
    quantity: "1",
  },
];

const RequestDetailScreen = ({ navigation }) => {
  return (
    <ScrollView>
      <View style={styles.container}>
        <Card style={styles.card}>
          <View style={styles.cardContainer}>
            <Image
              style={styles.stretch}
              source={{
                uri:
                  "https://s3.amazonaws.com/uifaces/faces/twitter/brynn/128.jpg",
              }}
            />
            <View style={styles.textContainer}>
              <Text>brynn</Text>
              <Text>Calle 123</Text>
            </View>
          </View>
        </Card>
      </View>

      <Card>
        {products.map((product, i) => {
          return (
            <View
              key={i}
              style={{
                flex: 1,
                flexDirection: "row",
                justifyContent: "space-between",
                flexWrap: "wrap",
                margin: 16,
              }}
            >
              <Text>{product.name}</Text>
              <Text>{product.quantity}</Text>
            </View>
          );
        })}
        <Button
          large
          rightIcon={{ name: "CheckListScreen" }}
          title="Aceptar solicitud"
          buttonStyle={{
            backgroundColor: "#27AE60",
            width: "100%",
          }}
          onPress={() => navigation.navigate("CheckListScreen")}
        />
      </Card>
    </ScrollView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  card: {
    backgroundColor: "#fff",
    justifyContent: "space-between",
  },
  cardContainer: {
    flexDirection: "row",
    margin: 5,
    justifyContent: "flex-start",
  },
  cardTextContainer: {
    flex: 1,
    flexDirection: "row",
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

export default RequestDetailScreen;
