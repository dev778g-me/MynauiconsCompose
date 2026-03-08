package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TypeBold: ImageVector
    get() {
        if (_TypeBold != null) {
            return _TypeBold!!
        }
        _TypeBold = ImageVector.Builder(
            name = "Filled.TypeBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.25f, 3f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2.25f)
                horizontalLineToRelative(8f)
                curveToRelative(1.29f, 0f, 2.507f, 0.577f, 3.389f, 1.57f)
                curveToRelative(0.88f, 0.99f, 1.361f, 2.314f, 1.361f, 3.68f)
                reflectiveCurveToRelative(-0.482f, 2.69f, -1.361f, 3.68f)
                quadToRelative(-0.093f, 0.105f, -0.19f, 0.202f)
                arcToRelative(5.2f, 5.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.527f, 1.408f)
                arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.524f, 3.71f)
                arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.524f, 3.71f)
                arcToRelative(5.2f, 5.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.687f, 1.54f)
                lineTo(5f, 21.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
                moveTo(5.75f, 3.75f)
                verticalLineToRelative(7.5f)
                lineTo(13f, 11.25f)
                curveToRelative(0.832f, 0f, 1.65f, -0.37f, 2.268f, -1.066f)
                curveToRelative(0.62f, -0.699f, 0.982f, -1.663f, 0.982f, -2.684f)
                reflectiveCurveToRelative(-0.361f, -1.985f, -0.982f, -2.684f)
                curveTo(14.65f, 4.121f, 13.83f, 3.75f, 13f, 3.75f)
                close()
                moveTo(5.75f, 12.75f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(9.289f)
                curveToRelative(0.982f, 0f, 1.925f, -0.393f, 2.622f, -1.096f)
                arcTo(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.75f, 16.5f)
                arcToRelative(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.09f, -2.654f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.621f, -1.096f)
                close()
            }
        }.build()

        return _TypeBold!!
    }

@Suppress("ObjectPropertyName")
private var _TypeBold: ImageVector? = null
