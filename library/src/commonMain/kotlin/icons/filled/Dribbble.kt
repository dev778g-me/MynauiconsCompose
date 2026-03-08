package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Dribbble: ImageVector
    get() {
        if (_Dribbble != null) {
            return _Dribbble!!
        }
        _Dribbble = ImageVector.Builder(
            name = "Filled.Dribbble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.077f, -1.234f)
                curveTo(2.934f, 5.964f, 7.033f, 2.25f, 12f, 2.25f)
                arcToRelative(9.72f, 9.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.882f, 2.844f)
                lineToRelative(0.01f, 0.01f)
                arcTo(9.72f, 9.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.75f, 12f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21.75f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 12f)
                moveToRelative(4.97f, -0.395f)
                curveToRelative(1.725f, -0.12f, 3.669f, -0.411f, 5.224f, -1.075f)
                quadToRelative(0.231f, -0.1f, 0.458f, -0.206f)
                curveToRelative(0.251f, 0.488f, 0.469f, 0.982f, 0.64f, 1.473f)
                lineToRelative(0.018f, 0.051f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.04f, 0.394f)
                curveToRelative(-3.144f, 1.38f, -5.55f, 3.419f, -6.912f, 4.974f)
                lineTo(6.66f, 18.29f)
                curveToRelative(1.202f, -1.399f, 3.463f, -3.357f, 6.463f, -4.675f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.875f, -0.334f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.757f, 3.44f)
                curveToRelative(0.133f, 0.739f, 0.241f, 1.418f, 0.333f, 1.994f)
                lineToRelative(0.013f, 0.081f)
                curveToRelative(0.046f, 0.29f, 0.09f, 0.56f, 0.13f, 0.797f)
                lineToRelative(1.395f, -0.761f)
                lineToRelative(-0.057f, -0.356f)
                curveToRelative(-0.092f, -0.574f, -0.202f, -1.266f, -0.337f, -2.02f)
                arcToRelative(42f, 42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.78f, -3.544f)
                curveToRelative(1.757f, -0.328f, 3.433f, -0.249f, 4.612f, -0.194f)
                lineToRelative(0.154f, 0.007f)
                lineToRelative(-0.005f, -1.506f)
                curveToRelative(-1.18f, -0.06f, -3.134f, -0.154f, -5.198f, 0.254f)
                lineToRelative(-0.057f, -0.17f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.73f, -1.676f)
                curveToRelative(1.746f, -1.011f, 3.211f, -2.223f, 4.069f, -2.957f)
                lineToRelative(-1.075f, -1.056f)
                curveToRelative(-0.855f, 0.727f, -2.185f, 1.812f, -3.738f, 2.712f)
                curveToRelative(-1.087f, -1.732f, -2.424f, -3.28f, -3.451f, -4.34f)
                lineTo(8.47f, 4.54f)
                curveToRelative(1f, 0.975f, 2.502f, 2.629f, 3.68f, 4.479f)
                quadToRelative(-0.147f, 0.067f, -0.295f, 0.13f)
                curveToRelative(-1.324f, 0.566f, -3.07f, 0.843f, -4.74f, 0.959f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.16f, 0.055f)
                lineToRelative(-0.198f, 1.494f)
                curveToRelative(0.899f, 0.032f, 2.135f, 0.04f, 3.462f, -0.053f)
            }
        }.build()

        return _Dribbble!!
    }

@Suppress("ObjectPropertyName")
private var _Dribbble: ImageVector? = null
