package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CableCar: ImageVector
    get() {
        if (_CableCar != null) {
            return _CableCar!!
        }
        _CableCar = ImageVector.Builder(
            name = "Filled.CableCar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.313f, 21.25f)
                arcToRelative(3.937f, 3.937f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.937f, -3.937f)
                verticalLineToRelative(-4.25f)
                arcToRelative(3.937f, 3.937f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.937f, -3.938f)
                lineTo(13.15f, 9.125f)
                lineToRelative(1.444f, -3.268f)
                lineToRelative(5.844f, 0.474f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.122f, -1.495f)
                lineToRelative(-6.341f, -0.514f)
                lineTo(3.61f, 2.758f)
                lineToRelative(-0.077f, -0.007f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.218f, 1.476f)
                lineToRelative(0.076f, 0.015f)
                lineToRelative(9.65f, 1.423f)
                lineToRelative(-1.53f, 3.46f)
                lineTo(6.689f, 9.125f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.938f, 3.938f)
                verticalLineToRelative(4.25f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.938f, 3.937f)
                close()
                moveTo(8.5f, 19.75f)
                verticalLineToRelative(-3.812f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3.812f)
                close()
                moveTo(17f, 15.938f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(1.374f)
                arcToRelative(2.437f, 2.437f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.437f, 2.438f)
                lineTo(17f, 19.75f)
                close()
                moveTo(4.25f, 17.312f)
                verticalLineToRelative(-1.375f)
                lineTo(7f, 15.937f)
                verticalLineToRelative(3.813f)
                horizontalLineToRelative(-0.312f)
                arcToRelative(2.437f, 2.437f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.438f, -2.437f)
            }
        }.build()

        return _CableCar!!
    }

@Suppress("ObjectPropertyName")
private var _CableCar: ImageVector? = null
