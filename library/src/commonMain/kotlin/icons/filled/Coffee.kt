package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Coffee: ImageVector
    get() {
        if (_Coffee != null) {
            return _Coffee!!
        }
        _Coffee = ImageVector.Builder(
            name = "Filled.Coffee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.624f, 3.416f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.248f, -0.832f)
                lineToRelative(-2f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.248f, 0.832f)
                close()
                moveTo(13.624f, 3.416f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.248f, -0.832f)
                lineToRelative(-2f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.248f, 0.832f)
                close()
                moveTo(16.624f, 3.416f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.248f, -0.832f)
                lineToRelative(-2f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.248f, 0.832f)
                close()
                moveTo(4.923f, 8.25f)
                curveToRelative(-0.924f, 0f, -1.673f, 0.749f, -1.673f, 1.673f)
                lineTo(3.25f, 17f)
                arcTo(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 21.75f)
                horizontalLineToRelative(6f)
                arcTo(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.75f, 17f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(0.75f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6.5f)
                horizontalLineToRelative(-0.91f)
                curveToRelative(-0.244f, -0.556f, -0.765f, -1f, -1.513f, -1f)
                close()
            }
        }.build()

        return _Coffee!!
    }

@Suppress("ObjectPropertyName")
private var _Coffee: ImageVector? = null
