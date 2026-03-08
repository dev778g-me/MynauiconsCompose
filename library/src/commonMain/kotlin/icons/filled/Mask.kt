package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Mask: ImageVector
    get() {
        if (_Mask != null) {
            return _Mask!!
        }
        _Mask = ImageVector.Builder(
            name = "Filled.Mask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.35f, 6.75f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 0.6f)
                verticalLineToRelative(2.188f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.2f, 1.25f)
                verticalLineTo(7.35f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -0.6f)
                moveToRelative(0.624f, 5.538f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.724f, -2.75f)
                verticalLineTo(7.35f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.2f, 0f)
                verticalLineToRelative(0.418f)
                lineToRelative(4.214f, -1.235f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.672f, 0f)
                lineToRelative(4.214f, 1.235f)
                verticalLineTo(7.35f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.2f, 0f)
                verticalLineToRelative(2.188f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.724f, 2.75f)
                arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.052f, 0f)
                moveToRelative(14.076f, -1.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.2f, -1.25f)
                verticalLineTo(7.35f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.2f, 0f)
                close()
            }
        }.build()

        return _Mask!!
    }

@Suppress("ObjectPropertyName")
private var _Mask: ImageVector? = null
