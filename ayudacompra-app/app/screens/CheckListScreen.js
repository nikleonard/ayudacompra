import "react-native-gesture-handler";
import React, { Component } from "react";
import { View, Text, StyleSheet } from "react-native";
import { Card, Button } from "react-native-elements";
import CheckBox from "react-native-check-box";
import { human } from "react-native-typography";

const products = [
  {
    id: "1",
    name: "Papel Higenico x8",
    quantity: "1",
  },
  {
    id: "2",
    name: "Cloro 1lt",
    quantity: "3",
  },
];

class CheckListScreen extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isChecked: false,
    };
  }
  render() {
    const { navigation } = this.props;
    return (
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
              <CheckBox
                style={{ flex: 1, padding: 10 }}
                onClick={() => {
                  this.setState({
                    isChecked: !this.state.isChecked,
                  });
                }}
                isChecked={this.state.isChecked}
                leftText={"CheckBox"}
              />
            </View>
          );
        })}
        <Button
          large
          rightIcon={{ name: "InitialScreen" }}
          title="Finalizar solicitud"
          buttonStyle={{
            backgroundColor: "#27AE60",
            width: "100%",
            marginTop: 16,
          }}
          onPress={() => navigation.navigate("InitialScreen")}
        />
        <Button
          large
          rightIcon={{ name: "CheckListScreen" }}
          title="¿Tienes dificultades?"
          buttonStyle={{
            width: "100%",
            marginTop: 16,
          }}
          onPress={() => console.log("OK Pressed")}
        />
      </Card>
    );
  }
}

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

export default CheckListScreen;
