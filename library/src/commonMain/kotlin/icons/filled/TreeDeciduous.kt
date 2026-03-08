package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TreeDeciduous: ImageVector
    get() {
        if (_TreeDeciduous != null) {
            return _TreeDeciduous!!
        }
        _TreeDeciduous = ImageVector.Builder(
            name = "Filled.TreeDeciduous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.25f, 21f)
                verticalLineToRelative(-2.745f)
                curveToRelative(-0.76f, 0.007f, -1.466f, 0.008f, -2.12f, -0.108f)
                curveToRelative(-0.814f, -0.145f, -1.554f, -0.464f, -2.35f, -1.09f)
                lineToRelative(-0.345f, -0.287f)
                curveToRelative(-0.614f, -0.541f, -1.724f, -1.834f, -2.383f, -3.215f)
                curveToRelative(-0.33f, -0.69f, -0.583f, -1.476f, -0.55f, -2.242f)
                curveToRelative(0.037f, -0.813f, 0.403f, -1.57f, 1.219f, -2.082f)
                lineToRelative(0.109f, -0.082f)
                quadToRelative(0.037f, -0.035f, 0.06f, -0.063f)
                curveToRelative(-0.13f, -0.752f, -0.136f, -1.7f, 0.28f, -2.524f)
                curveToRelative(0.45f, -0.885f, 1.313f, -1.49f, 2.622f, -1.622f)
                curveToRelative(0.083f, -0.264f, 0.183f, -0.585f, 0.293f, -0.865f)
                curveToRelative(0.14f, -0.355f, 0.346f, -0.775f, 0.693f, -1.09f)
                curveToRelative(0.383f, -0.347f, 0.882f, -0.516f, 1.471f, -0.445f)
                curveToRelative(0.492f, 0.06f, 1.021f, 0.282f, 1.6f, 0.644f)
                curveToRelative(0.265f, -0.2f, 0.555f, -0.41f, 0.859f, -0.574f)
                curveToRelative(0.373f, -0.202f, 0.826f, -0.375f, 1.328f, -0.359f)
                curveToRelative(1.072f, 0.035f, 1.846f, 0.878f, 2.44f, 2.282f)
                curveToRelative(0.66f, 0.225f, 1.47f, 0.638f, 2.041f, 1.3f)
                curveToRelative(0.315f, 0.364f, 0.567f, 0.814f, 0.665f, 1.352f)
                curveToRelative(0.093f, 0.51f, 0.037f, 1.052f, -0.177f, 1.618f)
                curveToRelative(0.884f, 0.473f, 1.348f, 1.207f, 1.465f, 2.048f)
                curveToRelative(0.11f, 0.798f, -0.098f, 1.633f, -0.404f, 2.37f)
                curveToRelative(-0.533f, 1.29f, -1.466f, 2.53f, -2.158f, 3.237f)
                lineToRelative(-0.28f, 0.269f)
                curveToRelative(-0.932f, 0.83f, -1.771f, 1.234f, -2.71f, 1.408f)
                curveToRelative(-0.669f, 0.123f, -1.39f, 0.125f, -2.168f, 0.119f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.build()

        return _TreeDeciduous!!
    }

@Suppress("ObjectPropertyName")
private var _TreeDeciduous: ImageVector? = null
