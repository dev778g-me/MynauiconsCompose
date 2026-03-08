package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Female: ImageVector
    get() {
        if (_Female != null) {
            return _Female!!
        }
        _Female = ImageVector.Builder(
            name = "Filled.Female",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 13.459f)
                verticalLineToRelative(2.541f)
                horizontalLineTo(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.25f)
                horizontalLineTo(14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-2.541f)
                arcTo(6.751f, 6.751f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.25f)
            }
        }.build()

        return _Female!!
    }

@Suppress("ObjectPropertyName")
private var _Female: ImageVector? = null
