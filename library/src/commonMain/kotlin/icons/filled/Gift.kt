package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Gift: ImageVector
    get() {
        if (_Gift != null) {
            return _Gift!!
        }
        _Gift = ImageVector.Builder(
            name = "Filled.Gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.559f, 4.984f)
                curveToRelative(0.013f, 0.637f, 0.457f, 1.266f, 1.391f, 1.266f)
                horizontalLineToRelative(3.007f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.439f, -0.855f)
                curveTo(9.964f, 4.498f, 9.152f, 3.75f, 7.95f, 3.75f)
                curveToRelative(-0.555f, 0f, -0.89f, 0.183f, -1.085f, 0.39f)
                arcToRelative(1.18f, 1.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.306f, 0.844f)
                moveToRelative(6.484f, 1.266f)
                horizontalLineToRelative(3.007f)
                curveToRelative(0.541f, 0f, 0.882f, -0.181f, 1.09f, -0.396f)
                curveToRelative(0.215f, -0.223f, 0.332f, -0.531f, 0.332f, -0.854f)
                reflectiveCurveToRelative(-0.117f, -0.63f, -0.333f, -0.854f)
                curveToRelative(-0.207f, -0.215f, -0.548f, -0.396f, -1.089f, -0.396f)
                curveToRelative(-1.202f, 0f, -2.014f, 0.748f, -2.568f, 1.645f)
                curveToRelative(-0.182f, 0.293f, -0.327f, 0.59f, -0.44f, 0.855f)
                moveToRelative(7.707f, 6.5f)
                lineTo(20.749f, 19f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 21.75f)
                lineTo(6f, 21.75f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.25f, 19f)
                verticalLineToRelative(-6.25f)
                lineTo(3f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                lineTo(2.25f, 9f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 6.25f)
                horizontalLineToRelative(0.37f)
                arcToRelative(2.85f, 2.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.311f, -1.234f)
                arcToRelative(2.68f, 2.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.716f, -1.906f)
                curveToRelative(0.513f, -0.543f, 1.26f, -0.86f, 2.175f, -0.86f)
                curveToRelative(1.948f, 0f, 3.161f, 1.252f, 3.844f, 2.355f)
                quadToRelative(0.11f, 0.18f, 0.206f, 0.356f)
                quadToRelative(0.096f, -0.176f, 0.206f, -0.356f)
                curveToRelative(0.683f, -1.103f, 1.896f, -2.355f, 3.844f, -2.355f)
                curveToRelative(0.907f, 0f, 1.651f, 0.319f, 2.168f, 0.854f)
                curveToRelative(0.509f, 0.527f, 0.754f, 1.219f, 0.754f, 1.896f)
                curveToRelative(0f, 0.426f, -0.097f, 0.857f, -0.295f, 1.25f)
                lineTo(19f, 6.25f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.75f, 9f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                close()
                moveTo(19.249f, 12.75f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(7.5f)
                lineTo(18f, 20.25f)
                curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                close()
                moveTo(11.249f, 20.25f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(4.749f, 19f)
                curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                close()
            }
        }.build()

        return _Gift!!
    }

@Suppress("ObjectPropertyName")
private var _Gift: ImageVector? = null
