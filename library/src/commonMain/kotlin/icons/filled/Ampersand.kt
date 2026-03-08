package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Ampersand: ImageVector
    get() {
        if (_Ampersand != null) {
            return _Ampersand!!
        }
        _Ampersand = ImageVector.Builder(
            name = "Filled.Ampersand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.201f, 12.179f)
                curveToRelative(0.31f, -0.277f, 0.622f, -0.566f, 0.921f, -0.865f)
                curveToRelative(1.084f, -1.083f, 2.188f, -2.472f, 2.188f, -4.053f)
                curveToRelative(0f, -1.9f, -1.565f, -3.511f, -3.449f, -3.511f)
                curveToRelative(-1.867f, 0f, -3.42f, 1.58f, -3.45f, 3.458f)
                curveToRelative(-0.18f, 1.412f, 0.318f, 2.764f, 1.102f, 3.989f)
                quadToRelative(0.269f, 0.418f, 0.584f, 0.826f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.158f, 1.06f)
                curveToRelative(-1.585f, 1.622f, -1.585f, 4.309f, 0f, 5.93f)
                curveToRelative(1.593f, 1.63f, 4.268f, 1.613f, 5.845f, 0f)
                lineToRelative(1.345f, -1.421f)
                lineToRelative(0.137f, 0.109f)
                curveToRelative(1.153f, 0.915f, 2.104f, 1.684f, 2.684f, 2.31f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.1f, -1.021f)
                curveToRelative(-0.675f, -0.727f, -1.727f, -1.572f, -2.851f, -2.464f)
                lineToRelative(-0.035f, -0.028f)
                lineToRelative(2.88f, -3.045f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.089f, -1.031f)
                lineToRelative(-2.97f, 3.139f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.34f, -1.974f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.444f, -1.408f)
                moveToRelative(-0.34f, -6.929f)
                curveToRelative(1.028f, 0f, 1.95f, 0.91f, 1.95f, 2.011f)
                curveToRelative(0f, 0.916f, -0.673f, 1.917f, -1.75f, 2.992f)
                curveToRelative(-0.266f, 0.267f, -0.547f, 0.527f, -0.831f, 0.782f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.454f, -0.647f)
                curveToRelative(-0.69f, -1.077f, -1.003f, -2.083f, -0.872f, -3.023f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.007f, -0.104f)
                curveToRelative(0f, -1.1f, 0.922f, -2.011f, 1.95f, -2.011f)
                moveToRelative(-0.792f, 7.915f)
                curveToRelative(0.493f, 0.53f, 1.025f, 1.042f, 1.57f, 1.535f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.313f, 1.954f)
                lineToRelative(-1.244f, 1.315f)
                curveToRelative(-0.993f, 1.01f, -2.697f, 1.018f, -3.697f, -0.004f)
                curveToRelative(-1.015f, -1.038f, -1.015f, -2.794f, 0f, -3.833f)
                curveToRelative(0.282f, -0.288f, 0.643f, -0.607f, 1.058f, -0.967f)
            }
        }.build()

        return _Ampersand!!
    }

@Suppress("ObjectPropertyName")
private var _Ampersand: ImageVector? = null
