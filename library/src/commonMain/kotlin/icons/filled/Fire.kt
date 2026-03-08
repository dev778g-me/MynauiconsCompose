package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Fire: ImageVector
    get() {
        if (_Fire != null) {
            return _Fire!!
        }
        _Fire = ImageVector.Builder(
            name = "Filled.Fire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.818f, 2.604f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.938f, -0.291f)
                curveToRelative(2.676f, 1.17f, 3.982f, 3.498f, 4.618f, 5.441f)
                curveToRelative(0.183f, 0.562f, 0.314f, 1.1f, 0.407f, 1.58f)
                lineToRelative(0.1f, -0.12f)
                curveToRelative(0.844f, -0.996f, 2.13f, -2.206f, 3.877f, -2.997f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.02f, 0.441f)
                quadToRelative(0.142f, 0.418f, 0.294f, 0.853f)
                curveToRelative(0.437f, 1.252f, 0.906f, 2.597f, 1.18f, 3.928f)
                curveToRelative(0.34f, 1.655f, 0.405f, 3.39f, -0.29f, 5.053f)
                arcToRelative(8.56f, 8.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.902f, 5.258f)
                curveToRelative(-4.727f, 0f, -8.56f, -3.827f, -8.56f, -8.55f)
                curveToRelative(0f, -3.874f, 1.296f, -5.885f, 3.22f, -8.868f)
                curveToRelative(0.346f, -0.539f, 0.714f, -1.109f, 1.098f, -1.728f)
                moveTo(7.75f, 13f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                arcTo(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, 13f)
            }
        }.build()

        return _Fire!!
    }

@Suppress("ObjectPropertyName")
private var _Fire: ImageVector? = null
