package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TallyFive: ImageVector
    get() {
        if (_TallyFive != null) {
            return _TallyFive!!
        }
        _TallyFive = ImageVector.Builder(
            name = "Filled.TallyFive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.53f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                lineToRelative(-0.78f, 0.78f)
                verticalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(5.81f)
                lineToRelative(-3.833f, 3.834f)
                verticalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-8.856f)
                lineToRelative(-3.834f, 3.833f)
                verticalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-3.523f)
                lineTo(3.53f, 21.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(0.78f, -0.78f)
                verticalLineTo(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(14.19f)
                lineToRelative(3.833f, -3.834f)
                verticalLineTo(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(8.856f)
                lineToRelative(3.834f, -3.833f)
                verticalLineTo(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(3.523f)
                lineTo(20.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
            }
        }.build()

        return _TallyFive!!
    }

@Suppress("ObjectPropertyName")
private var _TallyFive: ImageVector? = null
