package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.EuroDiamond: ImageVector
    get() {
        if (_EuroDiamond != null) {
            return _EuroDiamond!!
        }
        _EuroDiamond = ImageVector.Builder(
            name = "Filled.EuroDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.79f, 1.49f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.445f, 0.687f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.47f)
                lineToRelative(-7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.47f, 0f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.47f)
                lineToRelative(7.588f, -7.589f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.025f, -0.685f)
                moveTo(8.861f, 8.77f)
                curveToRelative(-0.59f, 0.708f, -0.937f, 1.583f, -1.06f, 2.48f)
                horizontalLineToRelative(-0.8f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12.75f)
                horizontalLineToRelative(0.812f)
                curveToRelative(0.339f, 2.069f, 2.044f, 4f, 4.438f, 4f)
                curveToRelative(1.305f, 0f, 2.448f, -0.287f, 3.27f, -1.075f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.04f, -1.083f)
                curveToRelative(-0.427f, 0.41f, -1.117f, 0.658f, -2.23f, 0.658f)
                curveToRelative(-1.432f, 0f, -2.593f, -1.134f, -2.913f, -2.5f)
                horizontalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineTo(9.321f)
                curveToRelative(0.11f, -0.573f, 0.345f, -1.102f, 0.693f, -1.52f)
                curveToRelative(0.481f, -0.578f, 1.207f, -0.98f, 2.236f, -0.98f)
                curveToRelative(1.113f, 0f, 1.803f, 0.248f, 2.23f, 0.658f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.04f, -1.083f)
                curveToRelative(-0.822f, -0.788f, -1.965f, -1.075f, -3.27f, -1.075f)
                curveToRelative(-1.471f, 0f, -2.62f, 0.598f, -3.389f, 1.52f)
            }
        }.build()

        return _EuroDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _EuroDiamond: ImageVector? = null
