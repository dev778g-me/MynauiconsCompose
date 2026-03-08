package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Bank: ImageVector
    get() {
        if (_Bank != null) {
            return _Bank!!
        }
        _Bank = ImageVector.Builder(
            name = "Filled.Bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.784f, 2.436f)
                arcToRelative(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.568f, 0f)
                lineTo(3.452f, 6.344f)
                curveToRelative(-1.64f, 0.825f, -1.074f, 3.327f, 0.784f, 3.327f)
                lineTo(6.25f, 9.671f)
                verticalLineToRelative(7.579f)
                lineTo(4.5f, 17.25f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.5f)
                horizontalLineToRelative(15f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.5f)
                horizontalLineToRelative(-1.75f)
                lineTo(17.75f, 9.67f)
                horizontalLineToRelative(2.014f)
                curveToRelative(1.858f, 0f, 2.423f, -2.501f, 0.784f, -3.326f)
                close()
                moveTo(7.75f, 17.25f)
                lineTo(7.75f, 9.67f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(7.58f)
                close()
                moveTo(12.75f, 17.25f)
                lineTo(12.75f, 9.67f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(7.58f)
                close()
            }
        }.build()

        return _Bank!!
    }

@Suppress("ObjectPropertyName")
private var _Bank: ImageVector? = null
