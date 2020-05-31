import "react-native-gesture-handler";
import React, {useState} from "react";
import { StyleSheet,View, ScrollView, CheckBox } from "react-native";
import { Button, Avatar, Text, Input, Divider } from "react-native-elements";

const CreateProductListScreen = () => {
    const [check, setCheck] = useState(true);
    return (
        <ScrollView>
            <Text h4>Mis datos</Text>
            <CheckBox title='Holi' checked={check} onPress={() => setCheck(!check)} />
        </ScrollView>
    );
};

export default CreateProductListScreen;
