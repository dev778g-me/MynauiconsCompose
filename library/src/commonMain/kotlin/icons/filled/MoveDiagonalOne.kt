package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MoveDiagonalOne: ImageVector
    get() {
        if (_MoveDiagonalOne != null) {
            return _MoveDiagonalOne!!
        }
        _MoveDiagonalOne = ImageVector.Builder(
            name = "Filled.MoveDiagonalOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                lineTo(8.905f, 7.845f)
                lineToRelative(7.25f, 7.25f)
                lineTo(19f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                horizontalLineToRelative(-6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                lineToRelative(2.845f, -2.845f)
                lineToRelative(-7.25f, -7.25f)
                lineTo(5f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineTo(5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4.25f)
                close()
            }
        }.build()

        return _MoveDiagonalOne!!
    }

@Suppress("ObjectPropertyName")
private var _MoveDiagonalOne: ImageVector? = null
